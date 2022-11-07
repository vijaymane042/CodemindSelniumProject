package programsCJ;

public class SumArrayExample {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Sum of diagonal element
                //  0  1  2 col-j
	int arr[][]= {{10,78,45},// 0i row
			       {45,65,98},//1
			       {66,21,11}};// 2array
	int sum =0,i,j=0;
    for ( i=0; i<=2;i++) {
   	for( j=0;j<=2;j++) {
    		if( i==j) {
   		   sum = sum +arr[i][j];  
    		System.out.println("Value of i :" +i + " value of j:"+j +" :"+arr[i][j]);
    		}

    	}
    	
    }
    System.out.println("value of diagonal elements :" +sum);
    
    
    //Sum of Even Numbers
	
  for ( i=0; i<=2;i++) {
	for( j=0;j<=2;j++) {
		if( arr[i][j]%2==0) {
		   sum = sum +arr[i][j];  
	System.out.println("Value of i :" +i + " value of j:"+j +" :"+arr[i][j]);
		}

	}	
}
    System.out.println("Sum of even number :" +sum);
	
    
    //Sum of odd numbers
	  for ( i=0; i<=2;i++) {
			for( j=0;j<=2;j++) {
				if( arr[i][j]%2!=0) {
				   sum = sum +arr[i][j];  
				System.out.println("Value of i :" +i + " value of j:"+j +" :"+arr[i][j]);
				}
			}	
		}
		System.out.println("Sum of odd number :" +sum);
	
    

}
}