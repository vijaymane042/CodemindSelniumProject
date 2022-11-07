//16102022


package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@Test
	
	public void launchbrowser () {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe"); // updated
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
	}
}
