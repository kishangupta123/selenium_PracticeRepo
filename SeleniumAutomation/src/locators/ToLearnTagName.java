package locators;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println(img.size());
		
		for (WebElement image : img) {
			System.out.println("the images present are : " + image.getText());
		}
		
		for (WebElement allLinks : links) {
			System.out.println(allLinks.getText());
		}
		
		driver.close();
	}

}
