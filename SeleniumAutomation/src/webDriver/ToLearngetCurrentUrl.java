package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chromewebstore.google.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
