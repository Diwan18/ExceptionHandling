package practicePack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gemini {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    driver.get("https://gemini.google.com/");
    
    driver.findElement(By.xpath("//span[text()='Sign in']/parent::a")).click();
    String title = driver.getTitle();
    System.out.println(title);
    
    driver.close();

}}
