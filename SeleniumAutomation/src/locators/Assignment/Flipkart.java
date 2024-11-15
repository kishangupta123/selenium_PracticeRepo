package locators.Assignment;

/*
 * Count how many images are present in FlipKart application.
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		List<WebElement> total_Image = driver.findElements(By.tagName("img"));
		System.out.println("The total images present in the flipkart page are : " + total_Image.size());

		driver.close();
	}

}
