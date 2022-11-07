//30092022
//Synatx xpath- ("//tagName[@attribute=’value’]")).sendkeys("password");
                 // (“//input[@type=’password’]”)
//CSS => 
//("a[href='register.php']"))
//(“tagname[attribute=’attribute value’]”))


package openbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe")
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Vijay\\Selenium setup\\Selenium_Sep\\ChromeDriver106.05249.61\\chromedriver_win32\\chromedriver.exe"); //updated
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		driver.manage().window().maximize();          //03102022
		
		//By using id
	    WebElement elm=driver.findElement(By.id("site-name"));
		//WebElement elm=driver.findElement(By.xpath("//a[text()='Demo Site']"));
		
		System.out.println(elm.getText());
		
		//By using name//01102022
		driver.findElement(By.name("userName")).sendKeys("user1");
		
		//by xpath //
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password1");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		//03102022
		//By linktext
		driver.findElement(By.linkText("REGISTER")).click();
		
		//By partialink
		driver.findElement(By.partialLinkText("REGIS")).click();
		
		//By classname
		String str=driver.findElement(By.className("row")).getText();
		System.out.println(str);
		
		//By CSS
		driver.findElement(By.cssSelector("a[href='register.php']")).click();
		
		//By tagName
		//driver.findElement(By.tagName("a"));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//Thread.sleep(10000);
		driver.close();
		
		
	}

	private static void close() {
		// TODO Auto-generated method stub
		
	}

}
