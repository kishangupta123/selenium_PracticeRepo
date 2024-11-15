package locators.LearningXpath.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		//Set up the WebDriver 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//URL to navigate to INSTAGRAM WebPage
		driver.get("https://www.instagram.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//navigating to the desired links
		driver.findElement(By.xpath("//span[contains(text(), 'Contact')]")).click();
		
		//Finding all the headings using the XPATH
//		List<WebElement> headings = driver.findElements(By.xpath("//h1 | //h2 | //h3 | //h4 | //h5 | //h6"));
//		List<WebElement> headings = driver.findElements(By.xpath("//span[contains(text(), 'for people')] | //span[contains(text(), 'About contact')] | //span[contains(text(), 'What')] | //span[contains(text(), 'we use')] | //span[contains(text(), 'How non')] | //span[contains(text(), 'transfer information')] | //span[contains(text(), 'Was')] | "));
		List<WebElement> headings = driver.findElements(By.tagName("h1"));
		List<WebElement> headings2 = driver.findElements(By.tagName("h2"));
		
        // Iterate over the headings and print their text
        for (WebElement heading : headings) {
            System.out.println("The headings present in the current webpage are : " + heading.getText());
        }	
        
        for (WebElement heading : headings2) {
        	System.out.println("The headings present in the current webpage are : " + heading.getText());
        }	

        // Close the WebDriver
        driver.close();
	}

}
