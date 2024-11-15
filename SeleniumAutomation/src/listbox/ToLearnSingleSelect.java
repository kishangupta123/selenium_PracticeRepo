package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php/");
		
		WebElement daySelect = driver.findElement(By.id("day"));
		
		WebElement monthSelect = driver.findElement(By.id("month"));
		
		WebElement yearSelect = driver.findElement(By.id("year"));
		
		Select ref = new Select(monthSelect);
//		ref.selectByIndex(0);
//		ref.selectByValue("3");
		ref.selectByVisibleText("Oct");
//		ref.deselectByVisibleText("Oct");
		
		
		Select ref1 = new Select(yearSelect);
//		ref1.selectByIndex(0);
		ref1.selectByValue("1999");
		
		Select ref2 = new Select(daySelect);
		ref2.selectByValue("21");
		
		System.out.println(ref.isMultiple());
		

	}

}
