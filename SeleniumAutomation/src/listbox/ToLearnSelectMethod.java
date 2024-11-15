package listbox;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSelectMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/");

		WebElement priceElement = driver.findElement(By.id("cars"));
		Select selectprice = new Select(priceElement);
		selectprice.selectByIndex(1);
		selectprice.selectByValue("199");

		selectprice.selectByVisibleText("More Than INR 500 ( 55 )");

		WebElement getFirst = selectprice.getFirstSelectedOption();
		System.out.println(getFirst.getText());
		
		
		List<WebElement> allSelected = selectprice.getAllSelectedOptions();
		
		for (WebElement allText : allSelected) {
			System.out.println(allText.getText());
		}
		
		
		driver.close();

	}
}
