package locators.LearningXpath.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShop {
	public static void main(String[] args) throws InterruptedException {

//		Initializing the driver
		WebDriver driver = new ChromeDriver();
		
//		maximizing the window
		driver.manage().window().maximize();
		
//		Navigating to the web page 
		driver.get("https://www.dunzo.com/bangalore");

//		Clicking on the search icon
		WebElement searchicon = driver.findElement(By.xpath("//a[@href='/search']"));
		searchicon.click();
		
//		Sending the data 'Apple' to the searchTextField
		WebElement searchTextField = driver.findElement(By.xpath("//input[contains(@placeholder, 'Search')]"));
		searchTextField.sendKeys("Apple");
		Thread.sleep(3000);

		// WebElement addProduct =
		// driver.findElement(By.xpath("//p[contains(text(),'Apple -
		// Kashmiri')]/../..//p[text()='₹299']/../..//button[@shape='circular']/../..//button[text()
		// = 'ADD']/../..//div[text()='+']"));
		// addProduct.click();

//		Selecting the desired product from the given options
		WebElement addProduct = driver.findElement(By.xpath(
				"//p[contains(text(),'Apple - Kashmiri')]/../..//p[text()='₹299']/../..//button[@shape='circular']"));
		addProduct.click();

//		Adding product by clicking on the 'Add item' text field.
		WebElement addItem = driver.findElement(By.xpath("//button[text()='Add item']"));
		addItem.click();

		System.out.println("Item Added");
		Thread.sleep(3000);

//		Closing the browser
		driver.close();
	}

}
