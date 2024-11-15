package javaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/reg");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement genderTf = driver.findElement(By.id("custom_gender"));
		genderTf.clear();
		js.executeScript("arguments[0].value='Have a good day'", genderTf);
		
		WebElement pronoun = driver.findElement(By.id("preferred_pronoun"));
		Select sel = new Select(pronoun);
		sel.selectByVisibleText("She: \"Wish her a happy birthday!\"");
		
		
	}

}
