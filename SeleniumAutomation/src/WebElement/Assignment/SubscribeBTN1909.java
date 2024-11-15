package WebElement.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscribeBTN1909 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		
		boolean status = driver.findElement(By.xpath("//a[text()='Register']")).isDisplayed();
		System.out.println(status);
		
		WebElement subscribeBTN = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
//		Dimension size = subscribeBTN.getSize();
//		System.out.println("height " + size.getHeight());
//		System.out.println("width " + size.getWidth());
//		
//		Point location = subscribeBTN.getLocation();
//		System.out.println("x : " + location.getX());
//		System.out.println("y : " + location.getY());
		
		Rectangle allPoint = subscribeBTN.getRect();
		System.out.println("X coordinates : " + allPoint.getX());
		System.out.println("Y coordinates : " + allPoint.getY());
		System.out.println("Height : " + allPoint.getHeight());
		System.out.println("Width : " + allPoint.getWidth());
		
		driver.close();
	}

}
