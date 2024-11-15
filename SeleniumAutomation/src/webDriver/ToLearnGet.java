  package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGet {
	public static void main(String[] args) {
		WebDriver driver;
//		driver = new ChromeDriver();
		driver = new EdgeDriver();
		
		//get method triggers the url or navigates to the web page
//		driver.get("https://www.flipkart.com/");
		
//		driver.get("https://www.google.co.in/");
		driver.get("https://www.amazon.in/");
		
		String title =  driver.getTitle();
		System.out.println();
	}

}
