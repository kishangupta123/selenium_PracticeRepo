package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnMoveToElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		WebElement links = driver.findElement(By.partialLinkText("MEN"));
//		WebElement links2 = driver.findElement(By.partialLinkText("WOMEN"));
//		WebElement links3 = driver.findElement(By.partialLinkText("KIDS"));
		
		Actions act = new Actions(driver);
		act.moveToElement(links).perform();
//		act.moveToElement(links2).perform();
//		act.moveToElement(links3).perform();
		
//		driver.findElement(By.linkText("T-Shirts")).click();
		
		driver.findElement(By.linkText("Jeans")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
