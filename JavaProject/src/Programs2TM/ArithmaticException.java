//15092022


package Programs2TM;

public class ArithmaticException {

	public ArithmaticException(String string) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int accountBalance =6000 ;
		 int withdrawAmount = 7000;
		 if (withdrawAmount > accountBalance);
		 {
		
	
	     try
	     { 
	     throw new Exception("my Exception");
	    // System.out.println( "Account balance is not sufficient ")	;  
	     }
	     catch (Exception a)
	     {
	     System.out.println( "Please insert withdraw amount is less than AccountBalance ")	; 
	     }
	}
	     accountBalance = accountBalance-withdrawAmount;
	     System.out.println( "Your updated account balance is =" + accountBalance); 
}

}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	


