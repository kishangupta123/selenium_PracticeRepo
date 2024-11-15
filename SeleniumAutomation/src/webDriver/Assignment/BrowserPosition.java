package webDriver.Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPosition {
	public static void main(String[] args) throws InterruptedException {
		// it will initialize with a empty chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();

		//navigate to the passed url
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(15000);
		
		//capturing the parentId handle
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();

		// switching to the flipkart browser
		switchToWindow(driver, "flipkart");
		//capturing flipkart position in fpos variable
		Point fpos = driver.manage().window().getPosition();

		//switching to the ebay browser
		switchToWindow(driver, "ebay");
		// capturing the ebay position in epos variable
		Point epos = driver.manage().window().getPosition();
		
		// passing the value of flipkart position as an argument to the ebay setPosition
		driver.manage().window().setPosition(fpos);

		//switching back to flipkart
		switchToWindow(driver, "flipkart");
		// passing the value of ebay position as an argument to the flipkart setPosition
		driver.manage().window().setPosition(epos);
		
		switchToWindow(driver, "ebay");
		driver.manage().window().setPosition(fpos);

	}

	//creating a method to call the switchToWindow using driver and url as an argument
	public static void switchToWindow(WebDriver driver, String url) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			driver.switchTo().window(id);
			String actURL = driver.getCurrentUrl();
			if (actURL.contains(url)) { //compares it, if the condition satisfies it will terminate and performs the action
				break;
			}
		}
	}
}
