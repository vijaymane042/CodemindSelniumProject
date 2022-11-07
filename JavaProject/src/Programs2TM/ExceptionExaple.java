     //13092022

package Programs2TM;

import java.security.DigestException;

public class ExceptionExaple { 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
		int i=10;
		i=i/0;
		System.out.println("This is end of code");
		System.out.println("This is end of code 2");

		}

//		catch(DigestException e)
//		{
//	      String str = null ;
//		  System.out.println("Please dont try to divide by 0");
//		}

		//catch(ArrayIndexOutOfBoundException e)
		

		finally
		{
		System.out.println("Please handle exception properly");
		}



	}

}
