package actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDobleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
		WebElement addBtn = driver.findElement(By.id("add"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(addBtn).perform();
//		for (int i = 0; i < num-1; i++) {
//			act.doubleClick(addBtn).perform();
//		}		
	}
}
