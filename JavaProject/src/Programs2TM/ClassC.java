package Programs2TM;

public class ClassC extends ClassB  {
	
	public void getA() {
	System.out.println(" Value of a :"+ a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassC ClassC= new ClassC() ;
		ClassC.getA();
		ClassC.getB();
	}

}
