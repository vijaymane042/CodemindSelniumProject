//06102022

package openbrowser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//	System.setProperty(("webdriver.chrome.driver", "D:\\Vijay\\Selenium setup\\Selenium_Sep\\ChromeDriver106.05249.61\\chromedriver_win32_\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");

		driver.manage().window().maximize();

		// get.String(url)
		// System.out.println(driver.get("https://demo.guru99.com/test/newtours/index.php\"));

		// It take current url
		System.out.println(driver.getCurrentUrl());

		// it will return complete html code of page
		System.out.println(driver.getPageSource());

		// 07102022

		// get title of the current page
		System.out.println(driver.getTitle());

		//Browser Navigation commands
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().back();
		driver.navigate().forward();
		//Thread.sleep(10000);
		//Thread.sleep(18000);
		driver.navigate().refresh();
		//Thread.sleep(18000);

		//JavaScript Executor
	JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
	javascriptExecutor.executeScript("window.open(arguments[0])","https://www.amazon.com");           //key,args
	javascriptExecutor.executeScript("window.open(arguments[0])","https://www.google.co.in/");
		
	Thread.sleep(18000);
	
	driver.quit()	;	
		
		// it will close current instance of browser
		// driver.close();

	}

}
