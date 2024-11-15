package webDriver.Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop1609 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		String parentId = driver.getWindowHandle();
		WebElement facebookLink = driver.findElement(By.linkText("Facebook"));
		facebookLink.click();
		
		switchToWindow(driver, "tricentis");
		boolean parentURL = driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/");{
			System.out.println("Main Page displayed ? " + parentURL);
			driver.close();
		}
		
		switchToWindow(driver, "nopCommerce");
		boolean equals = driver.getCurrentUrl().equals("https://www.facebook.com/nopCommerce");{
			System.out.println("Does facebook page displayed? " + equals);
			
			WebElement newAccountBtn = driver.findElement(By.xpath("//span[contains(text(),'account')]"));
			newAccountBtn.click();
			Thread.sleep(3000);
			driver.close();
		}
		
		switchToWindow(driver, "%2FnopCommerce");
		boolean equals1 = driver.getCurrentUrl().equals("https://www.facebook.com/reg/?next=%2FnopCommerce");{
			System.out.println("create new account page is displayed? : " + equals1 );
			Thread.sleep(3000);
			WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
			firstname.sendKeys("John");
			
			driver.close();
		}
	}

	public static void switchToWindow(WebDriver driver, String url) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(url)) {
				break;
			}
		}
		
	}
}
