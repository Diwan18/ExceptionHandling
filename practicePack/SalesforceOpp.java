package practicePack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesforceOpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://login.salesforce.com/ ");
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Opportunities");
		driver.findElement(By.xpath("//b[text()='Opportunities']")).click();
		driver.findElement(By.xpath("//table/tbody/tr/th")).click();
		driver.findElement(By.xpath("(//span[text()='Email'])[2]")).click();
		driver.findElement(By.xpath("//li/input[@role='combobox']")).sendKeys("mohmaddiwan@gmail.com");
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Email Body']")));
		driver.findElement(By.xpath("//body[@aria-label='Email Body']")).sendKeys("I have completed the Selenium Challenge 13");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		driver.close();
		
		

	}

}
