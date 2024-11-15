import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Vtiger {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demo.vtiger.com/vtigercrm/");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File temp = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./SCREENSHOTS/screeenshots/vtiger.png");

		FileHandler.copy(temp, dest);

		driver.findElement(By.linkText("Vtiger")).click();
		String parentHandle = driver.getWindowHandle();

		Set<String> windowId = driver.getWindowHandles();
		System.out.println(windowId);

		for (String handle : windowId) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				String url = driver.getCurrentUrl();
				System.out.println(url);
				break;
			}
		}

		WebElement companyLink = driver.findElement(By.xpath("//a[contains(text(),'Company')]"));
		Actions act = new Actions(driver);
		act.moveToElement(companyLink).perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[1]")).click();

		WebElement contactNum = driver
				.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/..//p[contains(text(),'+91')]"));
		System.out.println(contactNum.getText());
		
		driver.close();
	}
}
