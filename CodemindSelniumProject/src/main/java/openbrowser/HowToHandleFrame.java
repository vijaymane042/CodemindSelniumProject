//08102022


package openbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");
		//By.xpath("//iframe[@id='frame1']");
		
		List<WebElement>list=driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		WebElement ele= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		//driver.switchTo().frame(ele);
		driver.switchTo().frame(3);
		
		//driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//a[@href='https://demoqa.com']")).getAttribute("href"));
		
		
		
		
		
	}

}
