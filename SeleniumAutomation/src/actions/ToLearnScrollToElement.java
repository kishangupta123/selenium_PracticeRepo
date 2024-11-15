package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnScrollToElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement searchLink = driver.findElement(By.xpath("//a[@href='/search']"));
		
		Actions actions = new Actions(driver);
//		actions.scrollToElement(searchLink).perform();
		
		actions.scrollByAmount(0, 500).perform();
		actions.pause(Duration.ofSeconds(5)).perform();
		actions.pause(2000).perform();
		actions.scrollByAmount(0, -500).perform();
		
		
		
		
		
	}

}
