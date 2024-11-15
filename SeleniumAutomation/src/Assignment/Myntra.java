package Assignment;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firfox.FirefoxDriver;

public class Myntra {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new org.openqa.selenium.firefox.FirefoxDriver();

		driver.get("https://www.myntra.com/");
		String URL = driver.getCurrentUrl();
		if(URL.equals("https://www.myntra.com/")) {
			System.out.println("Page loaded successfully");
		}
		else {
			System.out.println("Page not loaded correctly, please try again.");
		}
		driver.quit();
	}
}
