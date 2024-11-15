package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleNotificationPopup {
	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("--incognito");
//		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--start-fullscreen");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
//		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		driver.findElement(By.partialLinkText("MEN")).click();
		driver.findElement(By.xpath("//a[@data-group='men']")).click();
		
		driver.close();
	}

}
