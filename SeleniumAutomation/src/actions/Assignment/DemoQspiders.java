package actions.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DemoQspiders {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/");

		WebElement UILink = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		UILink.click();
		Thread.sleep(3000);
		
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		button.click();
		Thread.sleep(3000);
		
		WebElement rightClick = driver.findElement(By.xpath("//a[text()='Right Click']"));
		rightClick.click();
		Thread.sleep(3000);

		Actions act = new Actions(driver);

		WebElement rightClickBTN = driver.findElement(By.id("btn30"));
		act.contextClick(rightClickBTN).perform();
		Thread.sleep(3000);
		
		WebElement rightRightClick = driver.findElement(By.xpath("//div[text()='Yes']/..//div[1]"));
		act.doubleClick(rightRightClick).perform();
		Thread.sleep(3000);
		
		WebElement successMSG = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));

		File temp = successMSG.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(temp, new File("./screeenshots/successMSG.png"));
		System.out.println("Obtained success message : " + successMSG.getText());
		String textColor = successMSG.getCssValue("color");
		System.out.println("Text color : " + textColor);

		driver.close();
	}

}
