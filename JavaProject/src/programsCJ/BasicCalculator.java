package programsCJ;

public class BasicCalculator {
		
		  int a =10 ,b =20 ,C;
		  float d;
		  

		  // Not returning value , Not accepting arguments 
		  
		  public void addition() {
		  C = a+b;
		  System.out.println("Addition:  " + C);
			 
		  }
		  
		  // Returning value , Not accepting arguments
		  
		  public int multiplication () {
		  
			  C = a * b;
			  return C;
			  
		  }    
		  
		  //Returning value , Accepting parameters
		  
		  public int substraction (int var1, int var2 ) {
			  
			  C = var2 - var1; // c = 30-20
			  return C;	  
		  }
			//Not returning value , Accepting parameters
		    public void division(int i , int j) {
		    	
		    	float k;
		    	k = i/j;
		    	System.out.println("Division: " + k) ;
		    
		    }	  
		    public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int multiplication, substraction;
				BasicCalculator cal = new BasicCalculator();
				
				//Object
				
				cal.addition();
				
				multiplication = cal.multiplication();
				System.out.println("Multiplication: "+ multiplication);
				
				substraction = cal.substraction(20, 30);
				System.out.println("Substraction: "+ substraction);
				
				cal.division(100, 2);

				

			}
}
