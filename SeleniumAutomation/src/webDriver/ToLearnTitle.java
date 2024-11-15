package webDriver;

import java.net.SocketException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnTitle {
	public static void main(String[] args) throws SocketException{
		WebDriver driver;
		driver = new EdgeDriver();

		driver.get("https://www.flipkart.com/");

		//to get the title of the navigated web page
		String title = driver.getTitle();
		System.out.println(title);
		
		//checks for the condition if the actual and expected title are same or not.
		if(title.equals("Online Shopping Site for Mobils, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("User navigated successfully");
		}
		else {
			System.out.println("user failed to navigate");
		}
		
		driver.close();
	}
}
