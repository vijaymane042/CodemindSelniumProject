package programsCJ;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0;
		System.out.println("Fibonacci series");
		System.out.println(a);

		/*System.out.println(b);
		System.out.println( a);*/

		for ( int i=0; i<=20; i++ )
	{       a=b;
	       b=c;
	        c=a+b;
	        
	    
			System.out.println(c);
	}

	}

}
