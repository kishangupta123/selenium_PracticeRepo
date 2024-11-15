package actions.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chocolate0210 {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-popup-blocking");
		WebDriver driver;
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");

		WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame);

		WebElement photo1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement photo2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));

		WebElement trash = driver.findElement(By.id("trash"));
		Actions act = new Actions(driver);

		act.dragAndDrop(photo1, trash).perform();
		act.dragAndDrop(photo2, trash).perform();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();

		driver.findElement(By.xpath("//a[contains(.,'SQL Cheat Sheet')]")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandle = driver.getWindowHandles();

		for (String handle : allWindowHandle) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
			}
		}
		WebElement sqlJoins = driver.findElement(By.xpath("(//img[contains(@data-id,'6452')])[1]"));
		act.scrollToElement(sqlJoins).perform();
	}

	public static void TakesScreenshot(WebDriver driver) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./chocolate/" + time + ".png");
		FileHandler.copy(temp, dest);
	}
}
