package Assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver;
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(new URL("https://www.naukri.com/"));
		
		String captureUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.naukri.com/";
		
		if (captureUrl.equals(expectedUrl)) {
			System.out.println("Same webpage opened : verified");
		}
		else {
			System.out.println("Same webpage not opened : not verified");
		}
		
		Point position = driver.manage().window().getPosition();
		System.out.println("X coordinates : " + position.getX());
		System.out.println("Y coordinates : " + position.getY());
		
		driver.navigate().refresh();
		System.out.println("Refresh Successful");
		
		driver.close();
	}
}
