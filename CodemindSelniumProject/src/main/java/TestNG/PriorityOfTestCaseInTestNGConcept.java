package TestNG;

import org.testng.annotations.Test;

public class PriorityOfTestCaseInTestNGConcept {

	@Test
	public void testA() {
		System.out.println("A"); 
}
	@Test
	public void testB() {
		System.out.println("B"); 
	}
	
	@Test
	public void testC() {
		System.out.println("C"); 
	}
	
	@Test
	public void testZ() {
		System.out.println("Z"); 
	}

	@Test
	public void test1() {
		System.out.println("1"); 
}
}