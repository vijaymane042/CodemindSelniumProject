//17102022

package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver; // Declaring webdriver

	@Test(dataProvider="myDataProvider")
	public void verifyValidLogin(String userName, String password1) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("userName1");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password1");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement successfullLoginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		AssertJUnit.assertEquals(successfullLoginMsg.getText(), "Login Successfully");
		// assertEquals(successfullLoginMsg.getText(), "Login Successfull"); //Actual &
		// expected reult matched otherwise it shiuld failed

	}

	@Test
	public void verifyValidLogin2() {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("user2");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password2");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement successfullLoginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		AssertJUnit.assertEquals(successfullLoginMsg.getText(), "Login Successfully");

	}

	@Test
	public void verifyValidLogin3() {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("user3");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password3");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement successfullLoginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		AssertJUnit.assertEquals(successfullLoginMsg.getText(), "Login Successfully");
	}

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe"); // updated
		driver = new ChromeDriver();
		// WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@org.testng.annotations.DataProvider(name = "myDataProvider")
	public String[][] dataProvider() {
		String array[][] = { { "user1", "password1" }, { "user2", "password2" }, { "user3", "password3" } };
		return array;
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}