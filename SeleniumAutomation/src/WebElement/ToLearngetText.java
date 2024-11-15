package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");

		WebElement loginBTN = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginBTN.click();

		String errorMSG = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		System.out.println(errorMSG);

		if (errorMSG.contains("Login was unsuccessful")) {
			System.out.println("Error msg is displayed");
		} else {
			System.out.println("Error msg not displayed");
		}
	}

}
