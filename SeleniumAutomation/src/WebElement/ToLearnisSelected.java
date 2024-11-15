package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnisSelected {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement goodRadioBTN = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
		System.out.println("=-=-=-=-=-=-=-Before clicking-=-=-=-=-=-=-=-=-=");
		boolean value = goodRadioBTN.isSelected();
		System.out.println(value);
		
		System.out.println("After clicking");
		goodRadioBTN.click();
		System.out.println(goodRadioBTN.isSelected());
		
		driver.close();
	}
}
