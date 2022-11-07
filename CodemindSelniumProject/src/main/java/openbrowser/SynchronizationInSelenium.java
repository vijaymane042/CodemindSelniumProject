//14102022

package openbrowser;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe"); // updated
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		// implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		WebElement clickButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickButton.click();

		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.alertIsPresent());

		// fluent wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(6));
		fluentWait.ignoring(TimeoutException.class);
		fluentWait.pollingEvery(Duration.ofMillis(100));
		fluentWait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}
