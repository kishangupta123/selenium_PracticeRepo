package locators.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
// 1. Go to demoapp.skillrary.com
		driver.get("https://demoapp.skillrary.com/");

		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase("https://demoapp.skillrary.com/")) {
			System.out.println("Navigating to the correct web page");
		} else {
			System.out.println("Wrong web page displayed");
		}

// 2. Click on SIGNUP Button

		driver.findElement(By.partialLinkText("SIGNUP")).click();

// 3. Verify whether register page is displayed or not		
		String url1 = driver.getCurrentUrl();
		if (url1.equals("https://demoapp.skillrary.com/login.php?type=register")) {
			System.out.println("Navigated to the register page");
		} else {
			System.out.println("Not navigated to the register web page");
		}
		driver.navigate().to("https://demoapp.skillrary.com/signup.php");

// 4. fill all the details 		
		driver.findElement(By.name("firstname")).sendKeys("pom");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("pom");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("pom123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Selenium123");
		Thread.sleep(1000);
		driver.findElement(By.name("repassword")).sendKeys("Selenium123");
		Thread.sleep(1000);

		WebElement btn = driver.findElement(By.name("signup"));
		btn.click();
		Thread.sleep(2000);

		String Register = driver.getCurrentUrl();
		if (Register.equals("https://demoapp.skillrary.com/register.php")) {
			System.out.println("Successfully Registered");
		} else {
			System.out.println("Not Registered" + "\n" + "Please Try Again");
		}

		driver.navigate().back();
		System.out.println("navigated back");

		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}

}