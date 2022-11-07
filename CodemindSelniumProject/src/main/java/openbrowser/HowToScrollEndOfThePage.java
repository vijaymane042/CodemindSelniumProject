//11102022

package openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToScrollEndOfThePage {

	private static Object element;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		Thread.sleep(1000);

		// Scroll By Vertically
//		javascriptExecutor.executeScript("window.scrollBy(0,250)","");
//		Thread.sleep(18000);
//		javascriptExecutor.executeScript("window.scrollBy(0,500)","");
//		
		// Scroll vertically
		javascriptExecutor.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(18000);
		javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");

		javascriptExecutor.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(18000);
		javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");

		// Scroll Horizontaly
		javascriptExecutor.executeScript("window.scrollBy(500,0)", "");
		Thread.sleep(18000);
		javascriptExecutor.executeScript("window.scrollBy(-500,0)", "");

		// how to scroll till web element or scroll into view
		// WebElement element = driver.findElement(By.xpath("(//a[text()='See all
		// offers'])[18]"));

		WebElement element = driver.findElement(By.xpath("//a[text()='Careers']"));

		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(18000);

		// scroll till end of the page
		javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		driver.navigate().to("http://ressio.github.io/lazy-load-xt/demo/horizontal.htm");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
	}

}
