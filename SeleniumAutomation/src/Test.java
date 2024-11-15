import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.out.println("Enter a browser of your Choice : 'C' or 'c'  OR 'E' or 'e' OR 'F' or 'f' ");
		Scanner sc = new Scanner(System.in);
		char browser = sc.next().charAt(0);

		switch (browser) {
		case 'C':
		case 'c':
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome browser opened");
			break;

		case 'E':
		case 'e':
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("Edge browser opened");
			break;

		case 'f':
		case 'F':
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Firefox browser opened");
			break;

		default:
			System.out.println("Invalid browser selection.");
			break;
		}
		sc.close();

		// Actual Program Starts

		driver.get("https://demoapp.skillrary.com/");

		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase("https://demoapp.skillrary.com/")) {
			System.out.println("Navigated to the correct web page.");
		} else {
			System.out.println("Navigated to the wrong web page.");
		}

		driver.findElement(By.partialLinkText("SIGNUP")).click();
		String url1 = driver.getCurrentUrl();
		if (url1.equals("https://demoapp.skillrary.com/login.php?type=register")) {
			System.out.println("Navigated to the register page");
		} else {
			System.out.println("Not navigated to the register web page");
		}

		try {
			driver.findElement(By.name("firstname")).sendKeys("ABC");
			Thread.sleep(2000);
			driver.findElement(By.name("lastname")).sendKeys("XYZ");
			Thread.sleep(2000);
			driver.findElement(By.name("repassword")).sendKeys("Selenium123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("kishan123@gmail.com");

			driver.findElement(By.name("password")).sendKeys("Selenium123");
			WebElement btn = driver.findElement(By.name("signup"));
			btn.click();
			Thread.sleep(2000);
		}

		catch (ElementNotInteractableException e) {
//			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
		} finally {
			driver.close();
			System.out.println("Browser closed");
		}
	}
}
