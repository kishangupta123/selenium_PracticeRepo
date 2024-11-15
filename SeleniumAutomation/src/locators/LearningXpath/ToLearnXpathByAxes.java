package locators.LearningXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/kisha/OneDrive/Desktop/CSS/index.html");
		String collection = driver.findElement(By.xpath("//td[text()=' KGF ']/following-sibling::td[2]")).getText();
		System.out.println(collection);
		
		driver.close();
	}

}
