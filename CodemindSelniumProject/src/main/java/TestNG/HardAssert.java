//20102022
//Trim method in string 

package TestNG;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HardAssert {
	
 WebDriver driver;
	public void verifyValidLogin() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe"); // updated
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));//StaleelementExeception 
		loginButton.click();
		String actualUserName= driver.findElement(By.xpath("//span[text()='Admin']")).getText();
		
		Assert.assertEquals("actualUserName", "Admin");
		Assert.assertNotEquals(actualUserName, "Admi");

		//Assert.assertEquals("actualUserName", "Admi");                                       //Hard assert 

		driver.findElement(By.xpath("//i[contains(@class,'userdropdown-icon')]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']\")).click()")).click();
		
		//Assert.assertTrue(loginButton.getText().equals(loginButton))   ;                     //asserttrue(Boolean condition )
		
		driver.navigate().refresh();                //used for handling StaleElementExeception 
		// WebDriverWait.webDriverWait =new WebDriverWait(driver, Duration.ofSeconds(10));
		// webDriverWait.until
		
		String str="String";
		Assert.assertFalse(str.contains("str"));
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		Assert.assertFalse(driver.getCurrentUrl().contains("abcd"));

		 System.out.println(" This is after all assertioons ");
		
	}
}
