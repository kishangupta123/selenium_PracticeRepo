package actions.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		WebElement kids = driver.findElement(By.partialLinkText("KIDS"));
		
		Actions act = new Actions(driver);
		act.moveToElement(kids).perform();
		
		driver.findElement(By.partialLinkText("Ethnic Wear")).click();
		
		boolean verification = driver.getTitle().equalsIgnoreCase("Ki Etnhc - Buy Ki Etnhc online in India");
		System.out.println("Ethnic wear webpage displayed ? " + verification);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("b.png");
		
		FileHandler.copy(temp, dest);
		driver.close();
	}

}
