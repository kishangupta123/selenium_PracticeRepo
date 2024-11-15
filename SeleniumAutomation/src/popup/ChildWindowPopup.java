package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400));

		driver.get("https://www.shoppersstack.com/products_page/15");
		driver.findElement(By.id("compare")).click();

		Set<String> windowId = driver.getWindowHandles();
		for (String id : windowId) {
			driver.switchTo().window(id);

			String url = driver.getCurrentUrl();
			if (url.contains("flipkart")) {
				break;
			}
		}
		driver.manage().window().maximize();
//		driver.close();
	}
}
