package WebElement.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTiger1809 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// navigating to the URL
		String url = "https://demo.vtiger.com/vtigercrm/";
		driver.get(url);

		WebElement userNameTf = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		userNameTf.clear();
		Thread.sleep(2000);
		userNameTf.sendKeys("Testing");

		// Entered password = "Test@123"
		WebElement passwordTf = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordTf.clear();
		Thread.sleep(2000);
		passwordTf.sendKeys("Test@123");

		// click on Sign In button using submit
		WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signInButton.submit();

		String errorMSG = driver.findElement(By.id("validationMessage")).getText();
		System.out.println("The captured error message is : " + errorMSG);

		WebElement elementColor = driver.findElement(By.xpath("//span[@id='validationMessage']"));
		String color = elementColor.getCssValue("color");
		System.out.println(color);
		
		if(color.equals("rgba(255, 0, 0, 1)")) {
			System.out.println("It is in red color...");
		}
		else {
			System.out.println("It is not in red color...");
		}

		driver.close();
	}
}