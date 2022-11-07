package CollectionsInJava;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer a=10 , b=20 ;
     System.out.println(a+10);
     System.out.println(b+10);

     int c = a.intValue();      //c = Primitive Coverting  Wrapper classs into primitive 
     System.out.println(c);

     Integer d = a.intValue(); //a = Primitive  Converting primitive into wrapper 
     System.out.println(d);

	}

}
