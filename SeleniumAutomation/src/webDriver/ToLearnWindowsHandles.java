package webDriver;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWindowsHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();

		Set<String> allWindowHandle = driver.getWindowHandles();
		System.out.println(allWindowHandle);

		for (String string : allWindowHandle) {
			System.out.println(string);
		}
//		for (Iterator iterator = allWindowHandle.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
		driver.quit();
	}

}
