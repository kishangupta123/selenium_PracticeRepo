package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTaagname {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");

		String tagname = driver.findElement(By.xpath("//a[@class='ico-login']")).getTagName();
		System.out.println(tagname);
		driver.close();
	}

}
