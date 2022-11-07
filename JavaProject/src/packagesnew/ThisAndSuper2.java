//19092022


package packagesnew;

public class ThisAndSuper2 {
	int a = 10;
	public ThisAndSuper2 ()
	{
	this(10);
	System.out.println("This is non parametrised constructor ");
	}
	
	public ThisAndSuper2 (int a)
	{
	System.out.println("This is non parametrised constructor ");
	}
	
	public int test ( int a) 
	{
   return this.a=a ;   //used to differenciate between a & a 
		//return a=a ;
	}
	public void test3 () {
		this.test(10);
	}
	

	public static void main(String[] args) {
	ThisAndSuper2 t = new ThisAndSuper2() ;
	System.out.println(t.test(20));
	System.out.println(t.a);
    t.test3();
}
}