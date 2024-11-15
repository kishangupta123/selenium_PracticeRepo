package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayed {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "https://demowebshop.tricentis.com/";
		
		driver.get(url);
		
		boolean status = driver.findElement(By.id("small-searchterms")).isDisplayed();
		System.out.println(status);
		driver.close();
	}
}
