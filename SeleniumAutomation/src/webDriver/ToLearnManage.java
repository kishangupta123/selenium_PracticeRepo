package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//used to maximize the window.
		//always should be used as a precondition after launching empty browser
//		driver.manage().window().maximize();
		

		
		driver.get("https://www.agoda.com/");
		//used to minimize the window.
//		driver.manage().window().minimize();
		
		//used for making the window in full screen.
		//it should be written as post condition after url is launched.
//		driver.manage().window().fullscreen();
	}

}
