package webDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLearnNavigate {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.agoda.com/");
//		driver.navigate().to("https://www.agoda.com/");
		driver.navigate().to(new URL("https://www.agoda.com/"));
		
		System.out.println("navigated to the url");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("navigated back");
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("navigated forward");
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("refreshed");
		
		driver.close();
		
	}
}
