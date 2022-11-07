//12102022

package openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableVerification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/buttons.html");

		driver.manage().window().maximize();

		//Is Displayed
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_three']")).isDisplayed());
		
		// is enabled
		System.out.println(driver.findElement(By.xpath( "//button[@id='btn_three']")).isEnabled());
		//Thread.sleep(20000);
		System.out.println(driver.findElement(By.xpath( "//button[@id='btn_four']")).isEnabled());

		// get accessible name 
		System.out.println(driver.findElement(By.xpath( "//button[@id='btn_three']")).getAccessibleName());
		
		// getAttribute
		System.out.println(driver.findElement(By.tagName("button")).getAttribute("type"));
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_three']")).getAttribute("type"));

		// get css attribute
		//System.out.println(driver.findElement(By.xpath("//button[@id='btn_three']")).getCssValue("colour"));
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_three']")).getCssValue("color"));

		
		
		
	}
	
	
	
	
	

}
