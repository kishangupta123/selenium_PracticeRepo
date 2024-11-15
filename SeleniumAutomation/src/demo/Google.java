package demo;

import java.net.SocketException;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) throws SocketException,NullPointerException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser choice");
		String browser = sc.nextLine();
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} 
		else if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} 
		else {
			System.out.println("Wrong browser selection or browser not supported.");
		}
		
		
		String baseURL = "https://www.google.co.in/";
		String expectedUrl = "Google";

		driver.get(baseURL);
		String actualTitle = driver.getTitle();
		System.out.println("The title of the given url is : " + actualTitle);

		if (actualTitle.contentEquals(expectedUrl)) {
			System.out.println("Test Passed! ");
		} else {
			System.out.println("Test Failed!" + " The actual title is : " + actualTitle);
		}
		driver.close();
	}

}
