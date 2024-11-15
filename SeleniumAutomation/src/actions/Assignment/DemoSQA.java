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
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSQA {
	public static void main(String[] args) throws InterruptedException, MoveTargetOutOfBoundsException, IOException {

		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
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

		String parentHandle = driver.getWindowHandle();
		Set<String> allWindowHandle = driver.getWindowHandles();

		for (String handle : allWindowHandle) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);

				String url = driver.getCurrentUrl();
				System.out.println("Current url is : " + url);
				Thread.sleep(3000);
				handleMultipleWindow(driver, url);
//				break;
			}
		}
		driver.switchTo().window(parentHandle);
		System.out.println("Returned back to parent window" + parentHandle);
		driver.close();

	}

	public static void handleMultipleWindow(WebDriver driver, String url)
			throws MoveTargetOutOfBoundsException, InterruptedException, IOException {
		switch (url) {
		case ("https://www.globalsqa.com/sql-cheat-sheet/"): {
			WebElement sqlJoins = driver.findElement(By.xpath("(//img[@loading='lazy'])[1]"));
			Actions act = new Actions(driver);
			try {
				act.scrollToElement(sqlJoins).perform();
			} catch (MoveTargetOutOfBoundsException e) {
				e.getStackTrace();
			}

			TakesScreenshot(driver);

			Thread.sleep(5000);
			driver.close();
			break;
		}
		}
	}

	public static void TakesScreenshot(WebDriver driver) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./chocolate/" + time + ".png");
		FileHandler.copy(temp, dest);
	}
}
