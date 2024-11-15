package WebElement.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1809 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		String toolTip = driver.findElement(By.name("q")).getAttribute("title");
		System.out.println(toolTip);
		driver.close(); 
		
	}

}
