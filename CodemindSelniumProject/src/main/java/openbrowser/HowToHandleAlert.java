//10102022
//Whenever we trying to switching an alert If alert is not present then at that time we are getting NoAlertExeception 


package openbrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click(); //xpath
		
		Alert alt=driver.switchTo().alert();            //NoAlertExeception 
		
		//alt.accept();
		//alt.dismiss();
		System.out.println(alt.getText());
		alt.accept();
		
		/*driver.findElement(By.xpath("//button[@id='promtButton']")).click(); //If we getting exeception then it will be handled by javascriptExecutor 
		alt=driver.switchTo().alert();
		alt.sendKeys("This is response for alert");
		System.out.println("This is response for alert");*/
		
		//Scrolling view
//		WebElement clickButton2 = driver.findElement(By.xpath("//button[@id='promtButton']"));
//
//		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", clickButton2);
//		
//		 Thread.sleep(1000);
//		 
//		clickButton2.click();
//		Alert alt1=driver.switchTo().alert();
//		alt1.sendKeys("test");
		
		//11102022
		
		driver.switchTo().newWindow(WindowType.TAB);
		//Thread.sleep(18000);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);                      //Assignment
		driver.get("https://www.swiggy.com/");
		System.out.println(driver.getTitle());
		
	}

}
