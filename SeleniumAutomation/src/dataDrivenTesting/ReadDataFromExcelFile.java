package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step 1. create fis object
		FileInputStream fis = new FileInputStream("./testData/File1.xlsx");

		// Step 2. create reespective file type object
		Workbook workBook = WorkbookFactory.create(fis);

		// Step 3. call read methods
		String url = workBook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);

		String username = workBook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);

		String password = workBook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);

		String expectedOutput = workBook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(expectedOutput);

//		driver.get(url);
//		driver.findElement(By.id("email")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		if (driver.getTitle().equals(expectedOutput)) {
//			System.out.println("Verified");
//		}

//		driver.findElement(By.id("last")).click(); 

		int price = (int) workBook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		System.out.println(price);

		boolean status = workBook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(status);
//		
		LocalDateTime date = workBook.getSheet("Sheet1").getRow(1).getCell(6).getLocalDateTimeCellValue();
		System.out.println(date);

		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		int year = date.getYear();

		System.out.println(month);
		System.out.println(day);
		System.out.println(year);

	}
}
