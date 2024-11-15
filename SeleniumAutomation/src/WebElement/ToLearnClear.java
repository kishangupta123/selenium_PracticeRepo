package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement userNameTf = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		userNameTf.clear();
		Thread.sleep(2000);
		userNameTf.sendKeys("Testing");
		
		WebElement passwordTf = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordTf.clear();
		Thread.sleep(2000);
		passwordTf.sendKeys("1234");
		
		
		
		
	}
}
