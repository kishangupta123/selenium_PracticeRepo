package locators.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationProcess {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		// 1.Go to demoapp.skillrary.com
		driver.get("https://demoapp.skillrary.com/");

		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase("https://demoapp.skillrary.com/")) {
			System.out.println("Navigated to the correct web page");
		} else {
			System.out.println("Wrong web page displayed");
		}

		// 2. Click on "Sign UP button"
		driver.findElement(By.partialLinkText("SIGNUP")).click();

		// 3. Verify whether the register page is displayed or not
		String url1 = driver.getCurrentUrl();
		if (url1.equals("https://demoapp.skillrary.com/login.php?type=register")) {
			System.out.println("Navigated to the register page");
		} else {
			System.out.println("Not navigated to the register web page");
		}
		driver.navigate().to("https://demoapp.skillrary.com/signup.php");

		// 4. fill all the details

		driver.findElement(By.name("firstname")).sendKeys("Kishan"); //first name
		driver.findElement(By.name("lastname")).sendKeys("gupta"); //last name
		driver.findElement(By.name("email")).sendKeys("kishang123@gmail.com"); //email
		driver.findElement(By.name("password")).sendKeys("Selenium123"); //password
		driver.findElement(By.name("repassword")).sendKeys("Selenium123"); //Confirm password
		Thread.sleep(1000);

		// 		5. click on register button
		WebElement btn = driver.findElement(By.name("signup"));
		btn.click();
		Thread.sleep(2000);

		String Register = driver.getCurrentUrl();
		if (Register.equals("https://demoapp.skillrary.com/register.php")) {
			System.out.println("Successfully Registered");
		} else {
			System.out.println("Not Registered" + "\n" + "Please Try Again");
		}

		// 6. navigate back and verify welcome page is displayed or not

		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		String newUrl = driver.getCurrentUrl();
		if (newUrl.equals(url)) {
			System.out.println("Welcome page displayed.");
		} else {
			System.out.println("Not displayed");
		}
	}

}
