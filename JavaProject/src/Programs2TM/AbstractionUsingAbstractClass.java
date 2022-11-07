package Programs2TM;

public class AbstractionUsingAbstractClass extends AbstractionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//AbstractionTest abstractionTest = new AbstractionTest();
		AbstractionUsingAbstractClass abstractImplementation = new AbstractionUsingAbstractClass() ;
        abstractImplementation.test1();
		System.out.println(abstractImplementation.a);
        abstractImplementation.test3();
       // abstractImplementation.test1();
        abstractImplementation.test2();
	}
	

	@Override
	public void test(int a) {
		
		
	}

	@Override
	public void test3() {
		
		
	}
	

}

