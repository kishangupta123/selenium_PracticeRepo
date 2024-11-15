	package WebElement.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus11 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Hyderabad to Bangalore Bus'])[1]")).click();
		Thread.sleep(6000);
//		driver.findElement(By.xpath("//span[text()='22 Sun']/../..//a[@class='btn date text tertiary md inactive button'][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']/..//input")).click();
		
		
		List<WebElement> prices = driver.findElements(By.xpath("//strong[@class='h5 fare']"));
		System.out.println(prices.size());
		TreeSet<Integer> priceSet=new TreeSet<Integer>();
		
		for(WebElement ele:prices) {
			String actPrice = ele.getText().replace(",", "");
			int intPrice = Integer.parseInt(actPrice);
			priceSet.add(intPrice);
		}
		System.out.println(priceSet);
//		System.out.println(priceSet.last());
		System.out.println(priceSet.first());
		
		
		
		
		Thread.sleep(6000);
//		List<WebElement> seatAvailable = driver.findElements(By.tagName("h6"));
//		System.out.println(seatAvailable);
		
//		String seatRemains = driver.findElement(By.xpath("//div[@id='seat-availability-info']/..//h6[text()='11']")).getText();
//		System.out.println(seatRemains);
		
		driver.findElement(By.xpath("//span[text()='Price']/..")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//button[contains(@class,'btn bus-info-btn filled primary sm inactive button')][text()='Show Seats'])[1]")).click();
		Thread.sleep(5000);
		String noOfSeats = driver.findElement(By.xpath("//h6[text()=' Seats Available']")).getText();
		System.out.println( "Number of seats available : " + noOfSeats);
////		ArrayList<Integer> list = new ArrayList<Integer>();
//		
////		for (Iterator iterator = priceSet.iterator(); iterator.hasNext();) {
////			Integer integer = (Integer) iterator.next();
////			list.add(integer);
////		}
////		
////		System.out.println(list);
////		System.out.println(list.get(list.size()-2));
		
		driver.quit();
	}
}
