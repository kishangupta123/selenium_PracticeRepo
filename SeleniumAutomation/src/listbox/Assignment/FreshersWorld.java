package listbox.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreshersWorld {
	public static void main(String[] args) {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		WebElement registerLink = driver.findElement(By.xpath("//span[text()='REGISTER NOW']"));
		boolean isDisplayed = registerLink.isDisplayed();
		System.out.println(isDisplayed);
		
		registerLink.click();
		
		WebElement currentCity = driver.findElement(By.id("currentCity"));
		Select selectCity = new Select(currentCity);
		selectCity.selectByVisibleText("Bangalore");
		
		WebElement qualificationDetails = driver.findElement(By.id("course"));
		Select selectEdu = new Select(qualificationDetails);
		selectEdu.selectByValue("16");
		
	}

}
