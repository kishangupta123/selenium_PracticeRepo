package WebElement.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTiger1709 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigating to the URL
		String url = "https://demo.vtiger.com/vtigercrm/";
		driver.get(url);
		
		// verifying welcome page is displayed or not
		boolean verification = driver.getTitle().equalsIgnoreCase("VTIger");
		System.out.println("Is welcome page is displayed or not ? " + verification);
		
		boolean linkVerification = driver.getCurrentUrl().contains(url);
		System.out.println(linkVerification);
		
		// Entered username = "testing"
		WebElement userNameTf = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		userNameTf.clear();
		Thread.sleep(2000);
		userNameTf.sendKeys("testing");
		
		// Entered password = "Test@1234"
		WebElement passwordTf = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		passwordTf.clear();
		Thread.sleep(2000);
		passwordTf.sendKeys("Test@1234");
		
		//click on Sign In button using submit
		WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signInButton.submit();
	}

}
