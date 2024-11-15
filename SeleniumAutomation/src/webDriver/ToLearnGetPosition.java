package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/");
		Point point = driver.manage().window().getPosition();
		int x = point.getX();
		int y = point.getY();
		
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}
}
