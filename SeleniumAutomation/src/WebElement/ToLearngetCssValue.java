package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetCssValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");

		WebElement loginBTN = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginBTN.click();
		
		//for the  error msg
		WebElement errorMSG = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		String color = errorMSG.getCssValue("color");
		String family = errorMSG.getCssValue("font-family");
		String weight = errorMSG.getCssValue("color");
		
		System.out.println(color);
		System.out.println(family);
		System.out.println(weight);
		
		
		// for the register link
		WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
		String color1 = register.getCssValue("color");
		String fontSize = register.getCssValue("font-size");
		String fontFamily = register.getCssValue("font-family");
		
		System.out.println(color1);
		System.out.println(fontSize);
		System.out.println(fontFamily);
	}
}
