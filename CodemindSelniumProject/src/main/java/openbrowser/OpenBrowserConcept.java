//29092022

//D:\\Vijay\\Selenium setup\\Selenium_Sep\\chromedriver_win32\\chromedriver.exe

//D:\Vijay\Selenium setup\Selenium_Sep\chromedriver_win32\chromedriver.exe

package openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"//D:\\Vijay\\Selenium setup\\Selenium_Sep\\chromedriver_win32\\chromedriver.exe");

		// System.setProperty("webdriver.chrome.driver","D:\\Vijay\\Selenium
		// setup\\chromedriver\\chromedriver_win32\\chromedriver.exe");
//WebDriverManager.chromedriver().setup();
//WebDriverManager.firefoxdriver().setup();
		webd.edgedriver().setup();
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
        
		driver.get("https://www.google.co.in/");
        driver.get("https://www.youtube.com/");
        driver.get("https://www.flipkart.com/");
	}

}
