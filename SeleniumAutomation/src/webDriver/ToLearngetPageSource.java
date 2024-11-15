package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * It is not used at industry level because it gives partial source code.
 * hence it is not recommended.
 * */

public class ToLearngetPageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		String ps =  driver.getPageSource();
		System.out.println(ps);
	}

}
