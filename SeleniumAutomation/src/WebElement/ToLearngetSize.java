package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement searchBTN = driver.findElement(By.xpath("//input[@value='Search']"));
		Dimension actualSize = searchBTN.getSize();
		System.out.println(actualSize);
		
		System.out.println("height " + actualSize.getHeight());
		System.out.println("width " + actualSize.getWidth());
		
		
	}

}
