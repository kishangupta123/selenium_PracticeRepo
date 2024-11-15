package locators.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 1. Open demowebshop app.
 * 2. Click on login link.
 * 3. Enter email & password.
 * 4. Click on login button.
 * 5. Verify home page is displayed or not.
 * */

public class DemoWebShop0909 {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/"); //1
		
		WebElement login_link = driver.findElement(By.linkText("Log in"));
		login_link.click(); //2
		
		WebElement email = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		
		email.sendKeys("kishangupta23489@gmail.com");
		password.sendKeys("Automation963"); //3
		
		WebElement login_Btn = driver.findElement(By.cssSelector("input[value='Log in']"));
		login_Btn.click(); //4
		
		 String currentTitle = driver.getTitle();
		System.out.println(currentTitle);
		
		if (currentTitle.equals("Demo Web Shop. ogin")) {
			System.out.println("Still in login page...");
		}
		else if (currentTitle.equals("Demo Web Sho")) {
			System.out.println("Home page displayed...");
		}
		else {
			System.out.println("U landed to some other web page...");
		}
		
		
//		driver.close();
	}

}
