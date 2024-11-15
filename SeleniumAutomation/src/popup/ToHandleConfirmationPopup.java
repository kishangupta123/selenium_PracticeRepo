package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		
		Alert confirmPop = driver.switchTo().alert();
		System.out.println(confirmPop.getText());
		confirmPop.accept();
		
		System.out.println(confirmPop.getText());
		confirmPop.accept();
	}
}
