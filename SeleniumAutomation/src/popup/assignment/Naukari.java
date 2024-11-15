package popup.assignment;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukari {
	public static void main(String[] args) {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement experience = driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(experience).perform();
		experience.click();
		
		WebElement resume = driver.findElement(By.id("resumeUpload"));
		actions.moveToElement(resume).perform();
		resume.sendKeys("C:\\Users\\kisha\\OneDrive\\Desktop\\Kishan Kumar Gupta resume.pdf");
		
		WebElement registerBTN = driver.findElement(By.xpath("//button[text()='Register now']"));
		actions.moveToElement(registerBTN).perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./chocolate/naukari"+time+".png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
