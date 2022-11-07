//27102022
//Src.test.resource<NEW<Other<General<file<FolderName<Finish            -     // creation of masterDataFile/propertiesFile


package TestNG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HowToReadPropertiesFile {

	static WebDriver driver;

	public static String getProperty(String key) throws IOException, FileNotFoundException {
		Properties properties = new Properties();
		File file = new File("src/test/resources/masterdata.properties");                     //masterData.properties path
		FileInputStream fileInputStream;

		fileInputStream = new FileInputStream(file);
		properties.load(fileInputStream);

		return properties.getProperty(key);
}
	@BeforeMethod
	public void launchBrowser() throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver", HowToReadPropertiesFile.getProperty("chromeDriverPath"));
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@Test
	public void loginToNewTours() throws FileNotFoundException, IOException {

		driver.get(HowToReadPropertiesFile.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement successfullLoginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		assertEquals(successfullLoginMsg.getText(), "Login Successfully");

	}
	@Test
	public void loginToNewTours2() throws FileNotFoundException, IOException {

		driver.get(HowToReadPropertiesFile.getProperty("url"));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement successfullLoginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		assertEquals(successfullLoginMsg.getText(), "Login Successfully");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
	
	
	