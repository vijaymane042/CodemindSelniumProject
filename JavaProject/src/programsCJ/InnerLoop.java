package programsCJ;

public class InnerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j ;
		/*for ( i=1;i<=5;i++) {//Outer for loop
			System.out.println("Iteration " +i+":" );
		}
		for ( j=1;j<=5;j++) {//Inner for loop
			System.out.println(" i="+i+", j="+j);
		}
           
		  //Sum of even value
		int sum=0;
		for ( i=0;i<=10;i++) {
			if (i%2==0) { //i%2 !=0
				sum = sum+i ;	
			}
		}
		System.out.println("Addition of even number's :"+ sum);
		//System.out.println("\n ");

	}*/

	 for(i=1;i<=5;i++)  //outer for loop
	 {
	 System.out.println("Iteration "+i+":");
	 
		for(j=1;j<=i;j++) //Inner for loop
		{
			System.out.println("i="+i+", j="+j);

		}
		System.out.println("");
	
	
	}	

        }
}


