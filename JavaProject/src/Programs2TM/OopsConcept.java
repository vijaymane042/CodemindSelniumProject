package Programs2TM;

public class OopsConcept {

       //Properties of OopsConcept
		int a = 10;
		int b = 20;
		
		//Behavior of OopsConcept class
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
        Calculation cal = new Calculation() ;
        cal.add(10,20);
        cal.sub(20,10);
       
		//int c = calculation.e;
		
		Addition add = new Addition () ;
		add.add(10,50);
	}	
}
class Addition {
	int e = 10;
	public void add (int a,int b) {
		System.out.println("Addition of ="+ (a+b));
	}
}
class Calculation extends Addition {
	public  void sub (int c, int d) {
		System.out.println("Substraction of ="+ (c-d));
	}
}
