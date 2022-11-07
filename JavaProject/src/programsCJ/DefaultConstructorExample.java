package programsCJ;

class ConstructorExample {
	
	  int i;
	  String str;
	  float f;
	
ConstructorExample() {
	  
	 i=10;
	 str="India";
	 f=100.100f;
		
	}

public void display () {
	System.out.println("Value of int variable :"+ i);
	System.out.println("Value of String variable :"+ str);
	System.out.println("Value of float  variable :"+ f);		
}
}

public class DefaultConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample ce  = new ConstructorExample () ;
			ce.display () ;
		}
	}
	


