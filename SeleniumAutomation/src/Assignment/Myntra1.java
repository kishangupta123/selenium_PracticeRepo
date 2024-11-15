package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class Myntra1 {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new org.openqa.selenium.firefox.FirefoxDriver();
//		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		String URL = driver.getCurrentUrl();
		if(URL.equals("https://www.myntra.com/")) {
			System.out.println("Page loaded successfully");
		}
		else {
			System.out.println("Page not loaded correctly, please try again.");
		}
		
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getHeight();
		
		System.out.println("height : " + height);
		System.out.println("width : " + width);

}
}