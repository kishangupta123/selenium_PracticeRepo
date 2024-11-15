package locators.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		// Initializing the WebDriver
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver  = new EdgeDriver();
		driver = new FirefoxDriver();

		// Maximizing the browser window
		driver.manage().window().maximize();

		// navigating the desired web page using URL
		driver.get("https://demowebshop.tricentis.com/login");

		// Clicking on the Register link present on the web page
		driver.findElement(By.linkText("Register")).click();

		// Filling all the necessary data needed for the registration.
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Kishan");
		driver.findElement(By.id("LastName")).sendKeys("Gupta");
		driver.findElement(By.id("Email")).sendKeys("kishangupta23489@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Automation963");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Automation963");

		Thread.sleep(2000);
		// clicking on the register button
		driver.findElement(By.name("register-button")).click();

		// closing the browser
		driver.close();
	}
}
