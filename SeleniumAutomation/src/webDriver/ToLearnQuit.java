package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnQuit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/155");
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
//		driver.close(); It is used to close the parent window.
		driver.quit();
		System.out.println("Execution Successful");
	}

}
