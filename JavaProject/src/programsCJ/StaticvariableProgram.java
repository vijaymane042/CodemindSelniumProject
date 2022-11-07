package programsCJ;


public class StaticvariableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   StaticProgram sp1 = new StaticProgram ();
	   StaticProgram sp2 = new StaticProgram ();
	   
	   System.out.println("Value of sp1 object a : " + sp1.a);
       System.out.println("Value of sp2 object b : "+ sp2.b);
       
       System.out.println("Static variable using sp1: "+ sp1.b);
       System.out.println("Static variable using sp2: "+ sp2.b);
       
       sp1.b=500 ;
       System.out.println("Updated Static variable using sp1: "+ sp1.b);
       System.out.println("Updated Static variable using sp2: "+ sp2.b);
       
       StaticProgram.b=1000;
       System.out.println("Updated Static variable using sp1: "+ sp1.b);
       System.out.println("Updated Static variable using sp2: "+ sp2.b);
       
       sp2.b=2000;
       System.out.println("Updated Static variable using sp1: "+ sp1.b);
       System.out.println("Updated Static variable using sp2: "+ sp2.b);
       
       StaticProgram sp3; //Creating reference
       
       sp3=new StaticProgram (); //memory is allocated
       
       
	}  


}
