package Programs2TM;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child child = new Child() ;
    child.add(10);
    child.add(10.10f, 10.10f);
    child.add(20.2f, 30);
    child.add(40, 60) ;
	}
	
	public void add (int a) 
	{
	System.out.println(a+a);
	
	}
	public int add (int b, int d)
			{
		System.out.println(b);
		return 10;
	}
	
	public void add (float h , int b  )
	{
		System.out.println(h+h);

	}
}
   class Child extends MethodOverloadingExample 
   {
   //public void add (int a, int b  )
	   public void add (float a, float b  )

   {
	   System.out.println(a/5);
   }
}