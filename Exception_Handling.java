package exceptionHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub




		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
//		id value is corrected
		driver.findElement(By.id("user-name")).sendKeys("visual_user");
//		updated xpath value
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("(//div[@class='login-box']//input)[3]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
//		driver.executeScript("agruments[0].click();", click);
		String price = driver.findElement(By.className("inventory_details_price")).getText();
		System.out.println("Price of Backpack "+price);
		
//		Click() is updated instead of getText()
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.className("shopping_cart_badge")).click();
		
		Thread.sleep(5000);
//		
//		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Continue Shopping']/following::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("first-name")).sendKeys("Leaf");
		Thread.sleep(5000);
		
//		Second name textbox is filled
		driver.findElement(By.id("last-name")).sendKeys("ABC");
		driver.findElement(By.name("postalCode")).sendKeys("600114");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Cancel']/following-sibling::input")).click();
		String sauceCard = driver.findElement(By.xpath("//div[text()='Payment Information:']/following-sibling::div")).getText();
		System.out.println(sauceCard);
		
//		Tagname is replaced (button)
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		
		driver.quit();


	}

}
