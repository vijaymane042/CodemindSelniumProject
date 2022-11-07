//15102022
//GetAllSelect => It will return after select 
//GetOption => It will return all option 
//Is multiple=> It will return true 
//Inner HTMl will return text 
//Deselect applicable for multiple 
//GetAll applicable for multiple 


package openbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe"); // updated
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		JavascriptExecutor javascriptExecutor =  (JavascriptExecutor) driver ;                // ElementNotInteractableExeception 
		
		driver.navigate().refresh();
		WebElement dropdownLocator = driver.findElement(By.xpath("//select[@name='country']"));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", dropdownLocator);
		//dropdownLocator.click();                                                               //ElementNotInteractableExeception
		Select select = new Select(dropdownLocator);
		
		List<WebElement>dropdownOptions = select.getOptions();
		System.out.println(dropdownOptions.size());
		for (WebElement elm:dropdownOptions) {
		System.out.println(elm.getAttribute("innerHTML"));              //Inner HTMl will return text 
	}
		System.out.println(select.isMultiple());
		
		// it will select ANTIGUA AND BARBUDA                              //Not able to select by index 
		select.selectByIndex(7);
		Thread.sleep(1000);
		
		// it will select AMERICAN SAMOA
		select.selectByValue("AMERICAN SAMOA");
		Thread.sleep(1000);

		// it will select INDIA
		select.selectByVisibleText("INDIA");
		Thread.sleep(1000);

		System.out.println(select.getFirstSelectedOption());                 //Not applicacble
		
		//select.deselectByVisibleText("INDIA");                               //Not able to deselect 

		
		
		
		
		
		
	}
}