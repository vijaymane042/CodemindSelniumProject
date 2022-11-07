package programsCJ;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String str = "Sachin" ;
      
      str=str.toUpperCase();   //ToUppercase
      
      System.out.println(str);
	
      
       //Concatination

      str = str.concat(" Tendulkar") ; 
      
      str = str.concat(" \nCodemind"); //Concatination

      System.out.println(str);
      
       //StringBuilder

      StringBuilder sb = new StringBuilder (" India ") ;   
      
      int a = sb.compareTo(new StringBuilder (" India ") );
      
      System.out.println(a);
      
      // replace

      sb.replace(0,sb.length()-1, "SAchiN ");    
      
      sb.append (" Tendulkar");  //Append

      System.out.println(sb);  //London Paris
      
      //StringBuffer
      
      StringBuffer sf = new StringBuffer (" M S ") ; 
      
      sf.append ("Dhoni");  //Append

      System.out.println(sf);  //M S Dhoni
      
      //Reverse
      
      String str1 = "CricKet" ;

      int Lcount = 0, Ucount = 0 ;
      
      for ( int i= str.length()-1; i>=0;i-- )
      {

    	  System.out.println(str.charAt(i));
      }
      
      //Count
	   for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >='A' && str.charAt(i) <='Z')
           Ucount = Ucount+1;
       else
    	   Lcount = Lcount+1;
	   }
			
			System.out.println("Lowercase letters count : "+ Lcount );
			System.out.println("Uppercase letters count : "+ Ucount );
 

      
	}

}

