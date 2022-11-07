package programsCJ;

public class Operators1 {
	 int a=10, b=20 ; 
	 
	 public void PreIncrement() {
		 System.out.println("Value of a : " + ++a);
		 System.out.println("Value of a: " + --a);
	 }
	 public void PostIncrement() {
		 System.out.println("Value of b: "+ ++b);
		 System.out.println("After increment of b: "+ b);
		 System.out.println("Value of b: "+ --b);
	 }
	 
	public void ModuleOperator() {
		int x=100, y=10,z; 
		z = x % y; 
		System.out.println("Reminder is: "+ z);	
	}
	
	public void RelationalOperators() {
	
		int age=30 ,eligibleAge=30;
		
		if (age<30) {             //Strictly less than 
		System.out.println("Strictly less than ");
	}
		
	    if (age<=30) {            //Less than or equal to 
	    	System.out.println("Less than or equal to ");
	    }
	    
	    
	    if ( age>29) {            //Strictly Greater than
	    	System.out.println("Strictly greater than ");
	    }
	    
	    if (age>=29) {            //Greater than or equal to 
	    	System.out.println("Greater than or equal to ");
	    }
	    
	    if (age==30) {            //Equal to
	    	System.out.println("You are eligible to ");
	    }
	    
	    if (age!=25)  {             // Not equal to 
	    	System.out.println("Age is not equal to 25 ");
	    }
	    
	    if (age==30 && eligibleAge==30) {
	    System.out.println("Both age are same: "+ "Logical AND" );
	    }
	    
	    if (age==30 ||eligibleAge==31)  {
	    	System.out.println("Both age are same: "+ "Logical OR");
	    }
	 
}
	public void turnaryOperator() {
		int a=10 ,c;
		c = a==11 ? 10:20;
		System.out.println("Turnary operator: "+ c);
	    }

   public void assignmentOperator() {
   	int a=10, b=20;
   	a += 100; //a= a+100;
   	System.out.println("Assignment Operator += :"+ a);
   
       b -= 2 ;  //b=b-2;
       System.out.println("Assignment Operator -= :"+ b);
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operators1 op = new Operators1();
		   op.PreIncrement();
		   op.PostIncrement();
		   op.ModuleOperator();
		   op.RelationalOperators();
		   op.turnaryOperator();
		   op.assignmentOperator();

	}


	

	}


