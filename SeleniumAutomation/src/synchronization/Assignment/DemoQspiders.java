package synchronization.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoQspiders {

	public static void main(String[] args) throws IOException {
		
		String time = LocalDateTime.now().toString().replace(":", "-");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

//		 Navigating to the Web Page
		driver.get("https://demoapps.qspiders.com/");
		WebElement UITestingLink = driver.findElement(By.xpath("//p[contains(text(),'UI Testing C')]"));
		UITestingLink.click();
		
		WebElement WebTable = driver.findElement(By.xpath("//section[contains(text(),'Table')]"));
		WebTable.click();
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/table")) {
			System.out.println("Table is displayed...");
		}
		
		WebElement DynamicWebElement = driver.findElement(By.xpath("//div/../..//a[(text()='Dynamic Web Table')]"));
		DynamicWebElement.click();
		
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/table/dynamicTable")) {
			System.out.println("Dynamic table is displayed...");
		}
		
		
		WebElement price = driver.findElement(By.xpath("//th[text()='Apple iPhone']/following-sibling::td[4]"));
		System.out.println(price.getText());

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screeenshots/"+time+"DemoQspiders.png");
		System.out.println(dest);
		FileHandler.copy(temp,dest);
	}

}
