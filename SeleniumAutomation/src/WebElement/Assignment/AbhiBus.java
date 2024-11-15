package WebElement.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbhiBus {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		System.out.println("Enter a browser of your Choice : 'C' or 'c'  OR 'E' or 'e' OR 'F' or 'f' ");
		Scanner sc = new Scanner(System.in);
		char browser = sc.next().charAt(0);

		switch (browser) {
		case 'C':
		case 'c':
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome browser opened");
			break;

		case 'E':
		case 'e':
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("Edge browser opened");
			break;

		case 'f':
		case 'F':
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			System.out.println("Firefox browser opened");
			break;

		default:
			System.out.println("Invalid browser selection.");
			break;
		}
		sc.close();
		
		// instructs the WebDriver to navigate to the specified URL
		driver.get("https://www.abhibus.com/");
		System.out.println("Navigated to the specific browser");

		// gives a pause of 3 second to perform the operation
		Thread.sleep(3000);

		// locates the link for the 'Hyedrabad' to 'Bangalore' bus route using the xpath
		// expression and clicks on it
		driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']")).click();
		System.out.println("clicked in the specific link");
		// pause the operation for 10 second
		Thread.sleep(10000);

		// finds and clicks on a UI element and expands the "Bus Partner" section
		WebElement busPartner = driver.findElement(By.xpath(
				"//div[@class='container accordion ']/..//div[text()='Bus Partner']/..//div[@class='collapsible-indicator col auto']"));
		// clicks on the drop down button
		busPartner.click();
		System.out.println("Expanded the bus partner section");
		// Stops the operation for 5 seconds
		Thread.sleep(5000);

		// clicks on the check box for "BSR TOURS & TRAVELS"
		WebElement checkBox = driver.findElement(By.xpath("//label[contains(text(),'BSR TOURS & TRAVELS')]/..//input[@type='checkbox'][1]"));
		checkBox.click();
		System.out.println("Clicked on the specific checkbox");

		// retrieves all <h5> elements present on the page
		List<WebElement> totalCount = driver.findElements(By.tagName("h5"));
		// the size (number of <h5> elements) will be printed in the console)
		System.out.println("Total number of BSR bus available are : " + totalCount.size());

		// retrieves all the price elements with the specified CSS class
		List<WebElement> priceElements = driver.findElements(By.cssSelector("[class='h5 fare']"));
		// Used to store the unique prices
		
		Set<Integer> priceSet = new HashSet<>();
		// the code loops through a list of price elements
		for (int i = 0; i < priceElements.size(); i++) {
			// for each element it stores price as text
			String priceText = priceElements.get(i).getText();
			//checks if the text is not empty
			if (!priceText.isEmpty()) {
				//removes all the ',' present and converts the price as text to an interger format
				int price = Integer.parseInt(priceText.replaceAll(",", ""));
				//add the price to the set to make sure that all the items are unique
				priceSet.add(price);
			}
		}

		// Convert the set to a list for sorting
		List<Integer> sortedPrice = new ArrayList<>(priceSet);
		Collections.sort(sortedPrice);

		// Print the sorted prices
		for (Integer price : sortedPrice) {
			System.out.println(price);
		}

		// If there are any prices in the list, the minimum price is printed.

		if (!sortedPrice.isEmpty()) {
			System.out.println("Minimum Price: " + sortedPrice.get(0));
		}
		
		

		driver.close();
	}
}























































































































































//WebElement low = driver.findElement(By.xpath("//strong[@class='h5 fare']/..//span[text()='980']"));
//System.out.println(low.getText());

//List<WebElement> priceElements = driver.findElements(By.cssSelector("[class='h5 fare']"));
//Map<WebElement, Integer> map = new HashMap<WebElement, Integer>();
//for (int i = 0; i < priceElements.size(); i++) {
//	if (priceElements.get(i).getText() != "") {
//
//		map.put(priceElements.get(i), Integer.parseInt(priceElements.get(i).getText().replaceAll(",", "")));
////	System.out.println(Integer.parseInt(priceElements.get(i).getText().replaceAll(",", "")));
//	}
//}
//List<Entry<WebElement, Integer>> le = new ArrayList<Map.Entry<WebElement, Integer>>(map.entrySet());
//le.sort(Entry.comparingByValue());
//
//for (Entry e : le) {
//	System.out.println(e.getValue());	
//	System.out.println();
//}
////System.out.println(le.getFirst().getKey());
//System.out.println(le.get(0));




























//// Initialize a PriorityQueue to store prices
//Queue<Integer> priceQueue = new PriorityQueue<>();
//
//// The code loops through a list of price elements
//for (int i = 0; i < priceElements.size(); i++) {
//    // For each element, store the price as text
//    String priceText = priceElements.get(i).getText();
//    // Checks if the text is not empty
//    if (!priceText.isEmpty()) {
//        // Removes all the ',' present and converts the price as text to an integer format
//        int price = Integer.parseInt(priceText.replaceAll(",", ""));
//        // Add the price to the queue
//        priceQueue.add(price);
//    }
//}
//
//// Convert the queue to a list for sorting
//List<Integer> sortedPrice = new ArrayList<>(priceQueue);
//Collections.sort(sortedPrice);
//
//// Print the sorted prices
//for (Integer price : sortedPrice) {
//    System.out.println(price);
//}
//
//// If there are any prices in the queue, the minimum price is printed
//if (!priceQueue.isEmpty()) {
//    System.out.println("Minimum Price: " + priceQueue.peek());
//}