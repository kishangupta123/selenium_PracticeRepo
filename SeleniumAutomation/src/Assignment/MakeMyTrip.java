package Assignment;

import java.net.SocketException;

/*
 * Open MakeMyTrip app in Edge and verify if login page is displayed or not. 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws SocketException {
		// Initializing the browser
		WebDriver driver;
		driver = new EdgeDriver();

		// Open the WebPage
		driver.get("https://www.makemytrip.com/");

		// Get the title of the page
		String title = driver.getTitle();
		System.out.println("The title of the given url is : " + title);

		// Check if the title matches
		if (title.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday")) {
			System.out.println("Login page is displayed.");
		} else {
			System.out.println("Login page not displayed.");
		}

		driver.close();
	}
}
