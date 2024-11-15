package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLearnSetPosition {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/");
		
		driver.manage().window().setPosition(new Point(100, 200));
		System.out.println("Execution Success");
	}

}
