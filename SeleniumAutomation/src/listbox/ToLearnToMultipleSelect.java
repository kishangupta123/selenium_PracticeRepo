package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnToMultipleSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement priceElement = driver.findElement(By.id("cars"));
		Select selectprice = new Select(priceElement);
		selectprice.selectByIndex(1);
		selectprice.selectByValue("199");
//		selectprice.selectByValue("501");
		selectprice.selectByVisibleText("More Than INR 500 ( 55 )");
	}

}
