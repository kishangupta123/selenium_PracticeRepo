package webDriver.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//span[contains(text(),' FAIR ')]/../..//button[@id='addToCart']")).click();
		Thread.sleep(3000);
		System.out.println("Item added to the cart...");
		driver.close();
	}
}
