//16102022

//Before Suite
//Before Test Plan
//Before Class
//Before Method
//                    This is First Test case
//After Method
//Before Method
//                      This is Second Test Case 
//After Method
//After Class 
//After Test Plan 
//After Suite



package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationsAll {

	@Test
	public void testCase6() {
		System.out.println("                       This is Sixth Test Case");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite ");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class ");
	}
	@Test
	public void launchBrowser () {
		System.out.println("                    This is First Test case");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");
	}
	
	@AfterTest
	public void afterTestPlan() {
		System.out.println("                    After Test Plan ");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Plan");
	}
	
	@Test
	public void testCase2() {
		System.out.println("                      This is Second Test Case  ");
	}
	
	@Test
	public void testCase4() {
		System.out.println("                       This is Fourth Test Case");
	}
	
	
	
	class TestAnnotations{
	
	@Test
	public void testCase3() {
	System.out.println("        This is Third Test Case");
	
	}
	
	@Test 
	public void testCase5() {
		System.out.println("          This is Fifth Test Case");
	}
	

	
	
	}
}





