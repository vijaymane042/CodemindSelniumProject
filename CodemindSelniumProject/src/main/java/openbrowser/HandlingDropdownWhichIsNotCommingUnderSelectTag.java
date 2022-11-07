//15102022

package openbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownWhichIsNotCommingUnderSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe"); // updated
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.airvistara.com/in/en/vistara-exclusives/vistara-direct?utm_source=google&utm_medium=search&utm_campaign=brand-exact&utm_content=vd&utm_term=vistara&ef_id=Cj0KCQjw852XBhC6ARIsAJsFPN2W93Y3PKHcOY54bUGp-alVTIfWTTVmwL0V3uz0KDObQPxlFQtp58YaAh-_EALw_wcB:G:s&s_kwcid=AL!596!3!511212724204!e!!g!!vistara&gclid=Cj0KCQjw852XBhC6ARIsAJsFPN2W93Y3PKHcOY54bUGp-alVTIfWTTVmwL0V3uz0KDObQPxlFQtp58YaAh-_EALw_wcB");

		// dropdown arrow locator
		driver.findElement(By.xpath("//img[contains(@src,'dropdown-arrow-purple.png')]")).click();
		
        //It will select all dropdown options
		List<WebElement> dropdownOption = driver.findElements(By.xpath("//ul[@id='country-scroll']//li//span"));

        //Getting one by one webelement & selecting according if condition 
		for (WebElement country : dropdownOption) {
			if (country.getText().equals("Nepal")) {
				country.click();
			}
			
			for (WebElement country2 : dropdownOption) {
				if (country2.getText().equals("France")) {
					country2.click();
				}
		}
	}
}
}
