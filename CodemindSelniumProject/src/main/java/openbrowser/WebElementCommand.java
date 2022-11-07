//12102022


package openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");

		driver.manage().window().maximize();

		WebElement userNameTextBox=driver.findElement(By.xpath("//input[@name='userName']"));
		userNameTextBox.sendKeys("userName");
		Thread.sleep(1200);
		
		// use for clearing text box
		userNameTextBox.clear();
		
		// used for verifying is element displayed on web page 
		System.out.println(userNameTextBox.isDisplayed());
		
		// used to verify element is enabled on web page 
		//Thread.sleep(1200);
		System.out.println(userNameTextBox.isEnabled());
		
		
		
		
		

	}

}
