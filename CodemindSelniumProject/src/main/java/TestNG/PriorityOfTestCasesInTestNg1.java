//18102022
//If test cases having same priority it will execute /prioritize acc to its name 
//Priority wil be decided acc to their Ascii value 


package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityOfTestCasesInTestNg1 {

	@Test(priority=-4)
	public void testA() {
		System.out.println("A");                                            //1 as per ascii vlaue
	}
	
	@Test(priority=1)
	public void testZ() {
		
		String str ="";
		
		if(!(str.equals("Logged in successfully"))){
			throw new SkipException("Execution skipped");
		}
		System.out.println("Z");                                           //3
	}
	
//	@Test (enabled=false)
//	public void testB() {
//		System.out.println("B");                                           //Skipped
//	}
//	
	@Test (enabled=true)
	public void testC() {
		System.out.println("C");                                           //2
	}
	
	@Test(priority=3)
	public void test1() {
		System.out.println("1");                                           //4
	}
	@Test(priority=3)
	public void testD() {
		System.out.println("D");
	
	
	}
}

