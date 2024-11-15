package locators.LearningXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathusingText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//
//		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
//
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("args");
//		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		
		System.out.println("Clicked");
		driver.close();
	}
}
