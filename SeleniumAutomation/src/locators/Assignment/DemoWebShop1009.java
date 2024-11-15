package locators.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 1. OPEN demowebshop
 * 2. CLICK ON LOGIN(USE XPATH BY TEXT())
 * 3. ENTER EMAIL AND PASSWORD (USE XPATH BY ATTRIBUTE)
 * 4. CLICK ON LOGIN BUTTON (USE XPATH BY ATTRIBUTE)
 * 5. VERIFY HOMEPAGE IS DISPLAYED OR NOT.
 * */

public class DemoWebShop1009 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement login_link = driver.findElement(By.xpath("//a[text()='Log in']"));
		login_link.click(); 
		
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		
		email.sendKeys("kishangupta23489@gmail.com");
		password.sendKeys("Automation963");
		
		WebElement login_btn = driver.findElement(By.xpath("//input[@value='Log in']"));
		login_btn.click();
		
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);
		
		if (currentTitle.equals("Demo Web Shop. Login")) {
			System.out.println("Still in login page...");
		}
		else if (currentTitle.equals("Demo Web Shop")) {
			System.out.println("Home page displayed...");
		}
		else {
			System.out.println("U landed to some other web page...");
		}
		
		driver.close();
	}
}
