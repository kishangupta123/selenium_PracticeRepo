package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("kishangupta23489@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("9876543210");
		driver.findElement(By.id("RememberMe")).click();
		
	}

}
