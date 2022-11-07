package Programs2TM;

public interface InterfaceExample1 {
	
	public static final int a = 10; //public static final constant  public static final- Instance member variable
	int b = 20;
	public abstract void test () ;    //Abstraction method 
	
	                                                          //public void testing ()  Non abstract method interface 
	
	void test2()		;
	}
	
class InterfaceImplementation implements InterfaceExample1 {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
	

}
