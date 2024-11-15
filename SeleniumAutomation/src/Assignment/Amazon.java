package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		String actualTitle =  driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Welcome page is displayed...");
		}
		else {
			System.out.println("Welcome page is not displayed...");
		}
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Back Navigation Successful....");
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println("Forward Navigation Successful....");
		
		driver.close();
	}

}
