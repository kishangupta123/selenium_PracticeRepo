package locators.Assignment;

import java.net.SocketException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoSkillRary extends SocketException {
	public static void main(String[] args) {

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
			System.out.println("Enter the correct URL... ");
		}
//		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver = new EdgeDriver();

		// maximizing the browser window
		driver.manage().window().maximize();

		System.out.println("Execution Starts");
		// navigating to the desired web page through the URL
		driver.get("https://demoapp.skillrary.com/");

		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase("https://demoapp.skillrary.com/")) {
			System.out.println("Navigating to the correct web page");
		} else {
			System.out.println("Wrong web page displayed");
		}

		// Navigating to the login page by clicking on the Login link
		WebElement loginLink = driver.findElement(By.linkText("LOGIN"));
		loginLink.click();

		// Entering the required email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("admin");
		System.out.println("Entered value to the email text field...");

		// Entering the required password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin");
		System.out.println("Entered value to the password text field...");

		// Clicking on the login button
		WebElement btn = driver.findElement(By.id("last"));
		btn.click();
		System.out.println("Clicked on the login button...");

		// closing the browser
		driver.close();
		System.out.println("Execution Ends");
		System.out.println("Window closed... ");
	}

}
