package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RedBus {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new EdgeDriver();
		
		driver.get("https://www.redbus.in/");
		String pageSource = driver.getPageSource();
		System.out.println("The page source of the current Url is : " + pageSource);
		
		driver.close();
	}
}
