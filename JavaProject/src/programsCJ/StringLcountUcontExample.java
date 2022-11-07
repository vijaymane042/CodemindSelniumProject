package programsCJ;

public class StringLcountUcontExample {

	private static int Numcount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "ViDyA@1#3*8566" ;
		int Lcount = 0, Ucount=0;
		int Num = 0  ;
		for (int i=0;i<str.length();i++) {
			
			//Uppercase & Lowercase letters count
			
			if( str.charAt(i)>= 'A' &&  str.charAt(i)>= 'Z')
					
			Ucount = Ucount+1;
			else
		    Lcount = Lcount+1;
			

	}
		System.out.println("Uppercase Letters Count :"+ Ucount);
		System.out.println("Lowercase Letters Count :"+ Lcount);

	    //Number Count
	   if( str.charAt(Num)>= 0 &&  str.charAt(Num)>= 10);
	   
	   Num = Numcount+1;
	   
		System.out.println("Numbers  Count :"+ Numcount);


}
}
