package programsCJ;

public class InstanceExample {                               //Instance members are declaring in outside the method & inside the class .

	public static void main(String[] args) {              
		// TODO Auto-generated method stub
		

		SampleProgram sp1 = new SampleProgram () ;
		SampleProgram sp2 = new SampleProgram () ;
		SampleProgram sp3 = new SampleProgram () ;
		
		System.out.println("Object of SP1 value of a: " + sp1.a);
		sp1.a  = 100;
		
		System.out.println("Updated Object of SP1 value of a.a: "+ sp1.a);
		System.out.println("Object of SP2 value of a: "+ sp2.a);
		
		sp2.a = 200;
		
		System.out.println("Updated Object of SP2 value of a: "+ sp2.a);
		System.out.println("Object of SP1 value of a: " + sp1.a);
		
		System.out.println("Object of SP1 value of a: " + sp1.a);
		
		sp3.a = 500;
		
		System.out.println("Updated Object of SP3 value of a: "+ sp3.a);
		System.out.println("Object of SP1 value of a: " + sp1.a);
		System.out.println("Object of SP2 value of a: "+ sp2.a);
		
		
		
		// System.out.println("Object SP1 value of x : " + sp1.x); // Local variable can't be accessible outside the class
		
		


	}

}
