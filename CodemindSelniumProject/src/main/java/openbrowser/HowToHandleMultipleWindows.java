//10072022

package openbrowser;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.open(arguments[0])", "https://www.amazon.com/"); // key,args

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		// How to Handle Mutiple Window
		String currentWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String s : allWindowHandles) {
			if (!s.equals(currentWindowHandle)) {

				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
				driver.close();

			}
		

		}
		driver.switchTo().window(currentWindowHandle);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
