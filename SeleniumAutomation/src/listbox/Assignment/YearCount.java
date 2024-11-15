package listbox.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YearCount {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/r.php/");
		
		WebElement selectYear = driver.findElement(By.id("year"));
		
		Select year = new Select(selectYear);
		List<WebElement> allYear = year.getOptions();
		
		
//		System.out.println("last option is : " + allYear.get(allYear.size()-1).getText());
		
		System.out.println("Last option is : " + allYear.getLast().getText());
		
		System.out.println("Total number of year is : " + allYear.size());
		
		driver.close();
	}

}
