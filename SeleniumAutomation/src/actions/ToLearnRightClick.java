package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnRightClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions action = new Actions(driver);
//		action.contextClick().perform(); to perfowm action on the webpage
		
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		action.contextClick(registerLink).perform(); //to perform the action over a webelement
		
		driver.close();
	}

}
