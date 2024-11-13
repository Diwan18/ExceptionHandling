package practicePack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://codepen.io/unknownUser7/pen/ZEdGLbq");
	    
	    driver.switchTo().frame("result");
	    
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Alert alert = driver.switchTo().alert();
		String Text = alert.getText();
		System.out.println(Text);
		alert.accept();
		
		try {
		alert.accept();}
		catch (NoAlertPresentException e){
			System.out.println("Exception handled");
		}
		String welcome = driver.findElement(By.xpath("//h1[text()='Welcome!']")).getText();
		
		if (welcome.contains("Welcome!")) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Not Successfull");
		}
		driver.close();


	}

}
