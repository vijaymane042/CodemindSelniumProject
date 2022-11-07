package packagesnew;

public class This {
	
	int a = 10 ;
	public This ()
	{
	  this(10);
	  System.out.println( " This is non parameterised constructor ");
	}
	
	
	 public This (int a)
	 {
	  System.out.println( " This is parameterised constructor ");
	 }
	 
	 public This ( int a,int b )
	 {
		  this ();
		  System.out.println( " This is 2 parameterised constructor ");
	 }
	 
	 public int test (int a) {
	   return this.a = a;
	 }
	 
	 public void test3() {
		 this.test(10) ;
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		This t = new This ();
		System.out.println(t.test(10) );
		System.out.println(t.a);
		t.test3();
		

	}
	
	
	
	

}
