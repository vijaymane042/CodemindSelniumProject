package Programs2TM;

public class MethodOverriding {
	
	private void test (int a) {
		System.out.println("This is a parent class method ");
	}
	
	public void calc () {
		System.out.println("b");
	}
  public static void main(String[] args) {

	MethodOverriding m = new child1();
		child1 c = new child1();
		c.test(10);
 
}
	
}
 class child1 extends MethodOverriding{

	public void test (int a) {
		System.out.println(" This is a child class");
	}
	
}