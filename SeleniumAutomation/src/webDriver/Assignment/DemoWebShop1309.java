package webDriver.Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Goto demowebshop
 * click on facebook link
 * capture the windowid of both demowebshop and facebook then print nusing for-each loop.
 * 
 * 
 * 
 * go to shoppersstack and find the xpath for add to cart button for fair and handsome.
 * */
public class DemoWebShop1309 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();

		Set<String> links = driver.getWindowHandles();
		for (String getLink : links) {
			System.out.println(getLink);
		}

	}
}
