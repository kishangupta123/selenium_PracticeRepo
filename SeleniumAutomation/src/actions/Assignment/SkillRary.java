package actions.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkillRary {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));
		searchBar.sendKeys("SELENIUM", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[text()='Selenium']/..")).click();
		
		Actions act = new Actions(driver);
			act.moveByOffset(347, 508).perform();
			act.doubleClick().perform();
	
			Thread.sleep(3000);
		driver.close();
}}
