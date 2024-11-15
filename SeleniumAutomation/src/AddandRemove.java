

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddandRemove {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); //disable notifications
		options.addArguments("--allow-insecure-localhost"); //allow insecure local host
		
		WebDriver driver = new ChromeDriver(options); //initialized CD with options content
		driver.manage().window().maximize(); //maximized the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //for implicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //for explicit wait

		driver.get("https://www.woodenstreet.com/"); //navigate to the url
		try {
			WebElement closeAd = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginclose1"))); //applied explicit wait to close the ad pop if apppears
			closeAd.click();
			System.out.println("Pop up closed...");
		} catch (Exception e) {
			System.out.println("No pop up found"); //if not found display this message 
		}

		//clicked on sofaSets section
		WebElement sofaSets = driver.findElement(By.xpath("(//p[text()='Sofa Sets']/..)[2]"));
		sofaSets.click();
		System.out.println("Clicked");

		//added first product to the cart
		WebElement product1 = driver.findElement(By.xpath(
				"(//p[text()='Sapphire 3 Seater Living Room Sofa with 2 Lounge Chairs and 4 Cushions (Creamy Cocoa Collection)']/..//p[contains(text(),'85,898')])[1]"));
		product1.click();
		System.out.println("Clicked on p1");
		Thread.sleep(9000);
		WebElement addToCartBTN = driver.findElement(By.xpath("/html/body/main/div[2]/div[7]/a[1]"));
		addToCartBTN.click();
		System.out.println("Clicked on add to cart button");

		//added second product to the cart
		WebElement prod2 = driver.findElement(By.xpath("//p[text()='Alaska 3 Seater Living Room Sofa Set with 2 Lounge Chairs ']"));
		prod2.click();
		System.out.println("Clicked on p2");
		Thread.sleep(9000);
		WebElement add2 = driver.findElement(By.xpath("//*[@id='button-cart-buy-now']"));
		add2.click();
		System.out.println("Clicked on add to cart 2");

		Thread.sleep(3000);
		
		//added third product to the cart
		WebElement prod3 = driver.findElement(By.xpath(
				"(//p[text()='Sapphire 3 Seater Living Room Sofa with 2 Lounge Chairs (Pearl Collection) '])[1]"));
		prod3.click();
		System.out.println("Clicked on product 3");
		Thread.sleep(9000);
		WebElement add3 = driver.findElement(By.xpath("/html/body/main/div[2]/div[7]/a[1]"));
		add3.click();
		System.out.println("Clicked on cart 3");

		//clicked on cart icon to view the product present in thr cart
		WebElement cart = driver.findElement(By.xpath("//a[@title='Cart']"));
		cart.click();
		System.out.println("Clicked on cart");

		//created method for  removing the highest priced product from the cart
		removeHighestPricedItem(driver);

		// to close the browser after execution
		driver.close();
	}
	public static void removeHighestPricedItem(WebDriver driver) {		
		// finds all the product price present in the cart 
		List<WebElement> products = driver.findElements(By.xpath("//strong[contains(text(),'Rs')]"));
		// initializing the highest price
		double highestPrice = 0;
		WebElement highestPriceProduct = null; //variable to hold the highest priced product

		// iterarte the each product to find the highest price
		for (WebElement product : products) {
			String priceText = product.findElement(By.xpath("//strong[contains(text(),'Rs')]")).getText(); //captures all the price and store it in priceText variable
			double price = Double.parseDouble(priceText.replaceAll(",", "").replaceAll("Rs ", "")); // remove the ',' , 'RS' , ' ' from the price ffor the comparison
			if (price > highestPrice) { //checks if current price is moer than highest price
//				System.out.println("price : " + price); 87989.0
//				System.out.println("highest price : " + highestPrice); 0
				highestPrice = price; // update highest price
//				System.out.println("updated highest price" + highestPrice); 87989.0
				highestPriceProduct = product; // update reference to highezst price product 
//				System.out.println("highest price product : " + highestPriceProduct ); 87989.0
			}
		}

		//if the highestPriceProduct found 
		if (highestPriceProduct != null) {
			WebElement removeButton = highestPriceProduct.findElement(By.xpath("//p[@title='Remove']")); //locate the highest price product remove button
			removeButton.click(); //clicked on the remove button
			System.out.println("The removed element is " + highestPrice); //prints the removed product price

			WebElement successMSG = driver.findElement(By.xpath("//div[@class='ws-cart-remove']")); //locateing the success msg xpath

			System.out.println("The captured message is : " + successMSG.getText());
		}

	}
}
