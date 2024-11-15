package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		long start = System.currentTimeMillis();

		driver.get("https://www.shoppersstack.com/products_page/23");
		
		driver.findElement(By.id("Check Delivery")).sendKeys("899636");
		WebElement checkBTN = driver.findElement(By.id("Check"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(checkBTN));
		checkBTN.click();
		
		System.out.println("Button Clicked");
		
		
		
	}

}
