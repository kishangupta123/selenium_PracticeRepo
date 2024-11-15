package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnisMultiple {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/r.php/");

		WebElement selectMonth = driver.findElement(By.id("month"));
		Select month = new Select(selectMonth);

		List<WebElement> allMonths = month.getOptions();
		int monthsSelection = allMonths.size();

		for (int i = 0; i < monthsSelection; i++) {
			month.selectByIndex(i);
			System.out.println(allMonths.get(i).getText());
//			if (selectMonth.isSelected()) {
//				System.out.println(allMonths.get(i).getText() + "Passed");
//			} 

//			 System.out.println(month.getAllSelectedOptions());
		}

	}
}
