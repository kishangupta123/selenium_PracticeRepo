package locators.LearningXpath.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To delete the Levi's shirt option from the dynamic web element option
 */

public class DemoQspiders {
	public static void main(String[] args) throws InterruptedException {

//		 Initializing the driver
		WebDriver driver;
		driver = new ChromeDriver();

//		 maximizing the window
		driver.manage().window().maximize();

//		 Navigating to the Web Page
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);

//		navigating through the UI Testing Concepts
		WebElement UITestingLink = driver.findElement(By.xpath("//p[contains(text(),'UI Testing C')]"));
		UITestingLink.click();
		Thread.sleep(2000);

//		Clicking on the Web Table option present in the left side of the panel
		WebElement WebTable = driver.findElement(By.xpath("//section[contains(text(),'Table')]"));
		WebTable.click();
		Thread.sleep(3000);

		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"demoUI\"]/main/section/div/section/aside/div/ul/div[2]/a")).click(
		 * ); driver.findElement(By.linkText(
		 * "https://demoapps.qspiders.com/ui/table/dynamicTable")).click();
		 * driver.navigate().to("https://demoapps.qspiders.com/ui/table/dynamicTable");
		 */

//		Navigating to the Dynamic Web Table present in the RHS of the panel
		WebElement DynamicWebElement = driver.findElement(By.xpath("//div/../..//a[(text()='Dynamic Web Table')]"));
		DynamicWebElement.click();
		Thread.sleep(3000);

//		WebElement deleteBTN = driver.findElement(By.xpath(
//				"//*[@id=\"demoUI\"]/main/section/article[1]/aside/div/div[2]/table/tbody/tr[1]/td[5]/section/a"));

//		Clicking on the delete button icon
		WebElement deleteBTN = driver
				.findElement(By.xpath("//th[text()=\"Levi's Shirt\"]/following-sibling::td[5]/..//section"));
		deleteBTN.click();

//		selecting the yes option from the given elements.
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		System.out.println("Item Deleted");

//		closing the driver
		driver.close();
	}
}
