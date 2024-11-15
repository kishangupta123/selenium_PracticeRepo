package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("password")).sendKeys("kaisijjdjnd");
//		WebElement checkPwd = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
//
//		Actions act = new Actions(driver);
//		act.clickAndHold(checkPwd).perform();
//		Thread.sleep(5000);
//		
//		act.release(checkPwd);
		
		Actions act = new Actions(driver);
		act.moveByOffset(1298, 317).clickAndHold().perform();
	}

}
