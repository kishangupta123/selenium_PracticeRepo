package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetLocation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		WebElement searchBTN = driver.findElement(By.xpath("//input[@value='Search']"));
		Point loc = searchBTN.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
//		System.out.println(loc);
	}
}
