package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetAttribute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
//		System.out.println(driver.findElement(By.name("q")).getAttribute("placeholder"));
		
		String value = driver.findElement(By.name("q")).getAttribute("placeholder");
		System.out.println(value);
	}
}
