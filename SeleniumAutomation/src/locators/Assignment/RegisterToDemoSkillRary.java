package locators.Assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterToDemoSkillRary {
	public static void main(String[] args) throws ElementNotInteractableException, InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a browser of your choice...");
		String browser = sc.nextLine();
		// Initializing the browser

		WebDriver driver = null;

		if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("fireFOx")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Enter the correct browser ... ");
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");

		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase("https://demoapp.skillrary.com/")) {
			System.out.println("Navigating to the correct web page");
		} else {
			System.out.println("Wrong web page displayed");
		}
		

		driver.findElement(By.partialLinkText("SIGNUP")).click();
		String url1 = driver.getCurrentUrl();
		if (url1.equals("https://demoapp.skillrary.com/login.php?type=register")) {
			System.out.println("Navigated to the register page");
		} else {
			System.out.println("Not navigated to the register web page");
		}
		driver.navigate().to("https://demoapp.skillrary.com/signup.php");
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("XYZ");
		Thread.sleep(2000);
		driver.findElement(By.name("repassword")).sendKeys("Selenium123");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("kishan123@gmail.com");

		driver.findElement(By.name("password")).sendKeys("Selenium123");
		WebElement btn = driver.findElement(By.name("signup"));
		btn.click();
		Thread.sleep(2000);
		
		String Resgister = driver.getCurrentUrl();
		System.out.println(Resgister);
		
//		driver.navigate().back();
//		String finalUrl = driver.getCurrentUrl();
//		System.out.println(finalUrl);
		

		
//		driver.close();
	}

}
