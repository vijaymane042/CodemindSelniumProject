//18102022


package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTestCasesInTestNg {

	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("This is Sanity check Test Case");
	}
	
		@Test(groups= {"sanity"})
		public void test2() {
			System.out.println("This is Sanity check Test Case2");
	}
		
		@Test(groups= {"smoke"})
		public void test3() {
			System.out.println("This is Smoke check Test Case");
		}
		
		@Test(groups= {"E2E" ,"smoke"})
		public void test4() {
			System.out.println("This is E2E Smoke check Test Case");
		}
		
		@Test(groups= {"Test"})
		public void test5() {
			System.out.println("This is E2E check Test Case");
	
		}
	}


