package popup;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnHiiddenDivisionPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date: ");
		int date = sc.nextInt();
		System.out.println("Enter the month: ");
		String month = sc.next();
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		
		while (true) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
//		driver.close();
	}
}
