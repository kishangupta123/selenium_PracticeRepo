package webDriver;

import java.util.Set;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
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
			
			
//			if (driver.getCurrentUrl().equals("https://www.flipkart.com/") | driver.getCurrentUrl().equals("https://www.amazon.in/") | driver.getCurrentUrl().equals("https://www.ebay.com/") ) {
//				driver.close();
//			}
			
			if (driver.getCurrentUrl().contains("flipkart")) {
				break;
			}
			
/*			Dimension size = driver.manage().window().getSize();
			int height = size.getHeight();
			int width = size.getWidth();
			System.out.println("height : " + height +  "height : " + width);
			driver.manage().window().maximize();
*/
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.name("q")).sendKeys("mobiles");
			
			driver.switchTo().window(parentId);
			driver.findElement(By.id("men")).click();
			
//			if (driver.getCurrentUrl().equals(url)) {
//				driver.close();
//			}
			
//			driver.close();
		}
	}
}