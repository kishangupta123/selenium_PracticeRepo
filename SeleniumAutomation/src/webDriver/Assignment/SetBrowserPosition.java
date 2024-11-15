package webDriver.Assignment;

import java.util.Set;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserPosition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(15000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();

		Set<String> allWindowID = driver.getWindowHandles();
		for (String switchTO : allWindowID) {
			driver.switchTo().window(switchTO);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(3000);

			if (driver.getCurrentUrl().equals("https://www.flipkart.com/")) {
				Point position = driver.manage().window().getPosition();
				System.out.println("X axis: " + position.getX() + "  Y axis: " + position.getY());

			if (driver.getCurrentUrl().equals("https://www.ebay.com/")) {
				Point position1 = driver.manage().window().getPosition();
				System.out.println("X axis: " + position.getX() + "  Y axis: " + position.getY());

				driver.manage().window().setPosition(position1);
				System.out.println("Position changed");

				driver.manage().window().setPosition(position);
				System.out.println("Position changed");
				}
			}
//			if (driver.getCurrentUrl().equals("https://www.flipkart.com/") | ( driver.getCurrentUrl().equals("https://www.ebay.com/")) ) {
//				Point position1 = driver.manage().window().getPosition();
//				Point position2 = driver.manage().window().getPosition();
//				
//				System.out.println(position1.getX() + position1.getY());
//				System.out.println(position2.getX() + position2.getY());
//			}
		}
	}
}