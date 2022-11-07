//22102022
//Src.resource<NEW<Other<General<file<FolderName<Finish
//test-output=>refresh CodemindSeleniumProject<
//ScreenShotFolderCreation=>CodemindSeleniumProject<New<Folder


package TestNG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.checkerframework.framework.qual.DefaultQualifier.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListners.class)                              //kind of annotation ,in that have to give name be like (className.class)i.e Binary file (.claass)

public class LoginScenarioWithListners {

	static WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void loginToNewTours() {

		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement successfullLoginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		assertEquals(successfullLoginMsg.getText(), "Login Successfully");

	}

	@Test
	public void logonToOrageHRM() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		String actualUserName = driver.findElement(By.xpath("//span[text()='Admin']")).getText();
		Assert.assertEquals(actualUserName, "Admi");
		Assert.assertEquals(actualUserName, "Admin");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	//Screenshot
	public static void getScreenShot(String name)throws IOException{
		TakesScreenshot takeScreenshot=(TakesScreenshot)driver ;
		File file=takeScreenshot.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("D:\\Vijay\\Selenium setup\\Screenshot\\"+name+".png"));
		FileUtils.copyFile(file, new File("C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\ScreenShot"+name+".png"));        //ScreenShotfolder<properties<copy path

	}


}
