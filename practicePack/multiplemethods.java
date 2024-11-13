package practicePack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class multiplemethods {
	
	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://my.aidaform.com/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='nickname']")).sendKeys("Diwan");
		driver.findElement(By.name("email")).sendKeys("mohmad@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hihello@12341");
		driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("Hihello@12341");

		
		WebElement Checkbox = driver.findElement(By.xpath("//span[text()='I have read and agree to the AidaForm ']"));
	    driver.executeScript("arguments[0].click();", Checkbox);
	    
	    driver.findElement(By.xpath("//button[text()='Create My Free Account']")).click();
	    driver.close();
}
}
