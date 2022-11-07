package programsCJ;

public class StarInnerLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i ,j ;
	    for(i=1;i<=5;i++)//row
	    	{
		//System.out.println("*");

	    for(j=1;j<=i;j++) //Column
	    {
		System.out.print("*");

		}
		System.out.println("");
	    }
	    System.out.println("");
	    
	    for(i=5;i>=1;i--) { 
	    	
		//System.out.println("*");
	    	
	    for(j=1;j<=i;j++) {
	    System.out.print("*");

	    }
	    System.out.println("");

	    }

}
}
