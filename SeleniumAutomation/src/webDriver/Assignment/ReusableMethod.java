package webDriver.Assignment;

import java.util.Set;

/*
 * The ReusableMethod Java class uses SELENIUM WebDriver to interact with web pages and perform browser based automation tasks. 
 * It starts by initializing a ChromeDriver instance to open a new CHROME browser window and maximizes it. 
 *  The browser navigates to a specified URL and waits for 25 seconds to ensure the page has fully loaded. 
 *  The method then captures the original window handle before clicking an element identified by its ID ("compare"). 
 *  After clicking, it retrieves all available window handles and switches to any new windows that may have opened. 
 *  For each new window, it checks the URL and processes it using the handleWindowByUrl method, which performs different actions based on the URL. 
 *  Finally, the new window is closed, and the browser switches back to the original window. 
 *  The browser session is terminated by quitting all associated windows. 
 *  The handleMultipleWindow method includes a switch-case structure to handle different URLs and throws an exception if the URL does not match any predefined cases.
*/

//importing all the required methods.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethod {
	public static void main(String[] args) throws InterruptedException, IllegalArgumentException {

		WebDriver driver;
		driver = new ChromeDriver(); // initializing the CHROME driver
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/15"); // navigating to the URL
		Thread.sleep(25000);
//		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();

		String parentHandle = driver.getWindowHandle(); // Storing the main window id

		
		Set<String> allWindowId = driver.getWindowHandles();
		
		// retrieves all the window handle
		for (String handle : allWindowId) {
			if (!handle.equals(parentHandle)) {

				// switches to the new window
				driver.switchTo().window(handle);
				String url = driver.getCurrentUrl();
				System.out.println(url);
				// calls the handleMultipleWindow method to process the window based on its URL
				handleMultipleWindow(driver, url);
				// closes the current window
//				driver.close();
			}
		}
		// switch back to original window
		driver.switchTo().window(parentHandle);
		System.out.println("Came back to parent window");
		// terminates all the browser and closes the server
//		driver.quit();
	}

	// This method will make use of new window based on its URL
	public static void handleMultipleWindow(WebDriver driver, String url) {
		String newline = System.lineSeparator();
		switch (url) {
		case ("https://www.flipkart.com/"): {
			String handle = driver.getWindowHandle();
			System.out.println(handle + newline);
			driver.close();
			break;
		}
		case ("https://www.ebay.com/") :{
			String title = driver.getTitle();
			System.out.println(title);
			driver.manage().window().maximize();
			System.out.println("maximized" + newline);
			break;
		}
		case ("https://www.amazon.in/") :{
			String handles = driver.getWindowHandle();
			System.out.println(handles + newline);
			driver.manage().window().maximize();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
			break;
		}
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + url);
		}

}}
