package Screenshot.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {
	public static void main(String[] args) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		String url = "https://www.flipkart.com/";
		driver.get(url);
		
		boolean verify = driver.getCurrentUrl().equals(url);
		
		driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screeenshots/"+time+".png");
		System.out.println(dest);
		FileHandler.copy(temp,dest);
		
		driver.close();
		
	}

}
