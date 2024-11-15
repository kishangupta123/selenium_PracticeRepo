package pom.Assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestScript {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		FileInputStream fis = new FileInputStream("./testData/commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String url = prop.getProperty("url");
		driver.get(url);

		WelcomePage wp = new WelcomePage(driver);
		wp.getRegisterLink().click();

		FileInputStream fis2 = new FileInputStream("./testData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis2);

		String firstName = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String lastName = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String email = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String password = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String confirmPassword = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		String successMessage = workbook.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();

		RegisterPage rp = new RegisterPage(driver);
		rp.getMaleRadioButton().click();
		rp.getFirstNameTextField().sendKeys(firstName);
		rp.getLastNameTextField().sendKeys(lastName);
		rp.getEmailTextField().sendKeys(email);
		rp.getPasswordTextField().sendKeys(password);
		rp.getConfirmPasswordTextField().sendKeys(confirmPassword);
		rp.getRegisterButton().click();
		String confirmationMsg = rp.getSuccessMsg().getText();
		if (confirmationMsg.equals(successMessage)) {
			System.out.println("Verification Successful");
		} else {
			System.out.println("Verification Not Successful");
		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./test-output/success.png");
		FileHandler.copy(temp, dest);
		
		driver.quit();
	}

}
