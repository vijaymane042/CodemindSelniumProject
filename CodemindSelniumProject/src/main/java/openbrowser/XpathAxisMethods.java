//04102022

package openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxisMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "D:\\Vijay\\Selenium setup\\Selenium_Sep\\ChromeDriver106.05249.61\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		driver.findElement(By.xpath("//input[contains @name,'user')]")).sendKeys("User1");
		
		driver.findElement(By.xpath("//input[starts-with @name,'userN')]")).clear();
		
		driver.findElement(By.xpath("//in[ut[ends-with @name,'name')]")).sendKeys("user2");
		
		//ancestor
		//Siblings
		//And ,Or
	}

}
