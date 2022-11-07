//13102022

package openbrowser;


import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementsCommand_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe"); // updated
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("USerName");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
	     Dimension d= driver.findElement(By.xpath("//a[text()='Flights']")).getSize();  //
		d.getHeight();
		d.getWidth();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		File file=driver.findElement(By.xpath("//a[text()='Flights']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Screenshot.png"));
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Flights']")).getLocation().getX());
		System.out.println(driver.findElement(By.xpath("//a[text()='Flights']")).getLocation().getY());
		
	   // FileHandler.copyfile(file,new File("C:\\Screenshot.png")); 
		
		String parentWindowHandle = driver.getWindowHandle(); // NoSuchSessionException

		driver.findElement(By.xpath("//a[text()='Flights']")).click();
		

		Thread.sleep(10000);
		
//		Actions ac=new Actions(driver);
//		ac.sendKeys(Keys.TAB);                                          //Exeception 
//		ac.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//div[@id='dismiss-button']")); // NoSuchElementExeception
		// driver.switchTo().alert().dismiss();

//	Set<String> set = driver.getWindowHandles();             //this is alert 
//		System.out.println(set.size());
//
//		for (String handle : set) 
//		{
//			if (handle != parentWindowHandle)
//			{
//				driver.close();
//	}		}
//		if (set.size() > 1)
//		{	
//	
//	   driver.switchTo().window(parentWindowHandle);
//		}                                                    //     this is alert   

		System.out.println(driver.findElement(By.xpath("//input[@value='roundtrip']")).isSelected());               //true

		System.out.println(driver.findElement(By.xpath("//input[@value='oneway']")).isSelected());               //false
     
	}

}
