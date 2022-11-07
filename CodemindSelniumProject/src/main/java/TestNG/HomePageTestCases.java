//31102022


//package TestNG;
//
//import java.time.Duration;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class HomePageTestCases {
//
//	
//	WebDriver driver;
//	HomePage homePage ;
//	
//	
//	@BeforeMethod
//	public void initilizeBrowser() {
//		//System.setProperty("webdriver.chrome.driver",
//				//"C:\\Users\\vijay\\eclipse-workspace\\CodemindSelniumProject\\src\\test\\java\\chromedriver.exe");
//				
//				WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//}
//	@Test
//	public void verifyValidLogin() {
//	homePage=new HomePage driver ();
//	driver.get("https://demo.guru99.com/test/newtours/index.php");
//	homePage.setUserName();
//	homePage.getUserName().sendkeys("test1");
//	homePage.setpassword();
//	homePage.getpassword().sendkeys("test1");
//	homePage.setLoginButton();
//	homePage.getLoginButton.click();
//	
//	}
//	
//}