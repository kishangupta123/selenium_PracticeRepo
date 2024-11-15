package popup.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbhiBus {
		public static void main(String[] args) throws InterruptedException, IOException {
			String time = LocalDateTime.now().toString().replace(":", "-");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
			
			driver.get("https://www.abhibus.com/");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the date: ");
			int date = sc.nextInt();
			System.out.println("Enter the month: ");
			String month = sc.next();
			System.out.println("Enter the year: ");
			int year = sc.nextInt();
			
			int count = 0;
			
			while(true)
			{	
				try {
				driver.findElement(By.xpath("//span[text()='"+year+"']/../..//span[text()='"+month+"']/../../..//span[text()='"+date+"']")).click();
				break;
			}
			catch (Exception e) {
				if (count == 1) {
					driver.findElement(By.xpath("(//span[@class='calender-month-change'])")).click();
					count++;
				}
				else {
					
					driver.findElement(By.xpath("(//span[@class='calender-month-change'])[2]")).click();
				}
			}
			}
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File temp = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./chocolate/"+time+".png");
//		FileHandler.copy(temp, dest);
	}
}
