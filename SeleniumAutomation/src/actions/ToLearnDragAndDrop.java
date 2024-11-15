package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		
		WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame);
		
		WebElement photo1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement photo2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement photo3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement photo4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		
		WebElement trash = driver.findElement(By.id("trash")); 
		Actions act  = new Actions(driver);
		
		act.dragAndDrop(photo3, trash).perform();
		act.dragAndDrop(photo1, trash).perform();
		act.dragAndDrop(photo2, trash).perform();
		act.dragAndDrop(photo4, trash).perform();
		
		WebElement photomanager = driver.findElement(By.id("gallery"));
		act.pause(20).perform();
		
		act.dragAndDrop(photo1, photomanager).perform();
		act.dragAndDrop(photo4, photomanager).perform();
		act.dragAndDrop(photo2, photomanager).perform();
		act.dragAndDrop(photo3, photomanager).perform();
	
	}
}
