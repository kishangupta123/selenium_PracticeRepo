package Assignment;

/*
 * Open Instagram app in chrome and verify welcome page is displayed or not.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		// Initializing the WebDriver
		WebDriver driver;
		driver = new ChromeDriver();

		// Open the instagram
		driver.get("https://www.instagram.com/");

		// Get the title of the page
		String title = driver.getTitle();
		System.out.println("The title of the given url is : " + title);

		if (title.equals("Instagram"))

			System.out.println("Login page displayed");

		else
			System.out.println("Login page not displayed");

		// close the browser
		driver.close();
	}
}
