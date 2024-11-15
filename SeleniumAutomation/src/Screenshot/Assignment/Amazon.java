package Screenshot.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon {
	public static void main(String[] args) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
		File file = logo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("./screeenshots/"+"a"+time+"a.png"));
	}

}
