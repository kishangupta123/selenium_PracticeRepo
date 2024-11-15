package popup.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArithmeticOperation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/js/js_ajax_intro.asp");
		
		driver.findElement(By.partialLinkText("Try it Yourself »")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		
		driver.close();
	}

}
		