package iframe.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetDisease {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		TakesScreenshot(driver);
		System.out.println("Navigated to url");
		
		WebElement childPage = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(childPage);
		Thread.sleep(5000);
		driver.findElement(By.id("montana")).click();
		TakesScreenshot(driver);
		System.out.println("Clicked on montana");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("SIGN UP")).click();
		TakesScreenshot(driver);
		System.out.println("Clicked on signup");
		
		Thread.sleep(5000);
		driver.findElement(By.id("user")).sendKeys("ab1253@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("loll@1234");
		driver.findElement(By.id("cpass")).sendKeys("loll@1234");
		driver.findElement(By.id("firstName")).sendKeys("ABCgs");
		driver.findElement(By.id("lastName")).sendKeys("ABCD");
		driver.findElement(By.id("phone")).sendKeys("9876546210");
		
		WebElement usertype = driver.findElement(By.id("user-type"));
		Select select = new Select(usertype);
		select.selectByVisibleText("Veterinarian");
		
		driver.findElement(By.id("accept-tou")).click();
		
		TakesScreenshot(driver);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement successMSG = driver.findElement(By.xpath("//p/..//b"));
		System.out.println(successMSG.getText());
		TakesScreenshot(driver);
		
		driver.quit();
	}
	public static void TakesScreenshot(WebDriver driver) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./iframe/" + time + ".png");
		FileHandler.copy(temp, dest);
	}
}
