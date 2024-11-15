package popup.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ShopperStack {
	public static void main(String[] args) throws InterruptedException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		for (String ele : windowId) {
			driver.switchTo().window(ele);
			
			String url = driver.getCurrentUrl();
			if (url.contains("amazon")) {
				break;
			}
		}
		Actions act = new Actions(driver);
		act.scrollByAmount(300, 500).perform();
		
		Thread.sleep(3000);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File org = new File("./chocolate/"+time+".png");
		
		try {
			FileHandler.copy(temp, org);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
