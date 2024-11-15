import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class OracleCreateAccount {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

		WebElement countryDropDown = driver
				.findElement(By.xpath("//select[contains(@id,'sView1:r1:0:country::content')]"));

		Select sel = new Select(countryDropDown);

		List<WebElement> allOptions = sel.getOptions();

		if (!allOptions.isEmpty()) {
			sel.selectByIndex(allOptions.size() - 1);
		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./SCREENSHOTS/screeenshots/oracle.png");
		FileHandler.copy(temp, dest);

//		driver.findElement(By.partialLinkText("Oracle.com Terms of Use")).click();
		driver.findElement(By.xpath(
				"/html/body/div[2]/form/div/div[3]/div[1]/div/div[5]/span/span/span/div[2]/table/tbody/tr/td/table/tbody/tr[26]/td[2]/span/a[1]"))
				.click();
		String parentId = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
			if (!handle.equals(parentId)) {
				driver.switchTo().window(handle);
				String url = driver.getCurrentUrl();
				break;
			}
		}

		List<WebElement> allHeadings = driver.findElements(By.tagName("h3"));
		for (WebElement ele : allHeadings) {
			System.out.println(ele.getText());
		}
	}

}
