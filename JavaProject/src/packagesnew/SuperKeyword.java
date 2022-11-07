package packagesnew;

public class SuperKeyword {
	
	int a = 10;
	public SuperKeyword () {
		System.out.println(" SuperKeyword default cons");
	}

    public SuperKeyword (int a ) {
    	System.out.println(" SuperKeyword para cons");

    	
    }
    public static void main(String[] args) {
		SuperKeyword su = new ChildFromSuper();
				

	}

}
class ChildFromSuper extends SuperKeyword {
	int a = 20 ;
	
	public ChildFromSuper() {
		super(10);
		System.out.println(" ChildFromSuper default cons");
		
	}	
		public void test (int b) {
			a = b ;
					super.a = this.a;
		}
		
		
	
}
