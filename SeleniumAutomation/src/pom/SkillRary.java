package pom;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillRary {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		
		StaleElement st = new StaleElement(driver);
		st.getSearchTextField().sendKeys("Selenium", Keys.ENTER);
		Thread.sleep(3000);
		
		st.getSearchTextField().sendKeys("TestNG");
		
		
//		WebElement searchTF = driver.findElement(By.id("navbar-search-input"));
//		searchTF.sendKeys("Selenium", Keys.ENTER);
//		Thread.sleep(3000);
//		searchTF.sendKeys("TestNG", Keys.ENTER);
		
	}

}
