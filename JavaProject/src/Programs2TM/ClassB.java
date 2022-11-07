package Programs2TM;

class ClassB extends ClassA {
	
	int b=20 ;

	
	public void getB() {
		
		System.out.println("Value of b =" + b );
	}
	public static void main(String args[]) {
		
		ClassB ClassB = new ClassB ();
		ClassB.getA();
	    ClassB.getB();
	}
}
