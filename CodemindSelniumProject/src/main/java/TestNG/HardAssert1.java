//20102022


package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert1 {

	@Test
	public void test() {
		int a=10 ;
		
		Assert.assertFalse(a==10);
		Assert.assertFalse(a>10);

		Assert.assertNotEquals(10, 20);
		
	}
	
}
