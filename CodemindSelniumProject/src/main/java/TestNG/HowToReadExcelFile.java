//28102022

package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToReadExcelFile {

	WebDriver driver;

	public void loginUsingExcelData() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

	}

	@Test
	public void readExcelFile() throws IOException {
		// xlsx-we have to XSSFWorkbook
		// Xls - We have to HSSFWorkbook
		File file = new File("src/test/resources/ExcelData/testData.xlsx ");
		FileInputStream fileInputStream = new FileInputStream(file);
		 HSSFWorkbook hssfWorkbook=new HSSFWorkbook(fileInputStream);
		 HSSFSheet hssfSheet =hssfWorkbook.getSheetAt(0);
		//XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		//XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

		int lastRowNumber = hssfSheet.getLastRowNum();
		for (int i = 1; i <= lastRowNumber; i++) {
			{

				HSSFRow hssfRow = hssfSheet.getRow(i);
				int lastCellNumber = hssfRow.getLastCellNum();
				for (int j = 0; j < lastCellNumber; j++) {
					System.out.print(hssfRow.getCell(j).getStringCellValue() + "\t");

				}
			}
		}
	}
}
