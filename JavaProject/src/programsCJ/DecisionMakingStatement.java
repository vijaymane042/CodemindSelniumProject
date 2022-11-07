package programsCJ;

public class DecisionMakingStatement {

	int age = 25, No_of_orders=2, Balance = 100000;

	public void IfStatementMethod() {

		if (age <= 25) {
			System.out.println("You are eligible ");
		}

	}

	public void IfElseStatementMethod() {

		if (age <= 20) {

			System.out.println("If block is executed You are eligible");

		} else {
			System.out.println("If block is executed You are not eligible");

		}

	}

	public void IfElseIfStatementMethod() {

		No_of_orders = 2;

		if (No_of_orders == 0)
			
		{
			System.out.println("30% Discount");

		}else 
		    if (No_of_orders == 1)
			
		{
			System.out.println("20% Discount");

		}else
		    if (No_of_orders == 2)
		{
			
		System.out.println("10% Discount");
		}

		   else 
		   {
			System.out.println("You are not eligible for Discount");
		}
		}
	

		
	
	public void NestedstatementMethod() {

		if (Balance <= 100000) 
		{
			 if (Balance >= 100000 && Balance <= 200000) 
		       {
			     System.out.println("You are eligible for 1 Lakh credit card");
		       }
		   else if (Balance >= 200000 && Balance <= 300000) 
		   {
			System.out.println("You are eligible for 2 Lakh credit card");

		   } 
		       else 
		   {
			System.out.println("You are eligible for 3 Lakh credit card");

		   }
			 
		   }
		 else
		   {
				System.out.println("You will be fined with RS 500");
			}
		
		}

	public void SwitchStatement() {
		
		switch(age) {
		
		case 20: System.out.println("Age is 20");
		   break;
		
		case 21: System.out.println("Age is 21");
		   break;
		
		case 23: System.out.println("Age is 23");
		   break;
		   
		   default: System.out.println("Default statement");
		}   
	    }
	

	public static void main(String[] args) {

		DecisionMakingStatement dm = new DecisionMakingStatement();
		dm.IfStatementMethod();
		dm.IfElseStatementMethod();
		dm.IfElseIfStatementMethod();
		dm.NestedstatementMethod();
		dm.SwitchStatement();
	}
}
