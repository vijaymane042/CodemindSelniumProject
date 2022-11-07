package programsCJ;

class Book {
	
	final int a = 20;   //Final 
	static String bookName = "Java " ; //Static
	static int bookId = 100 ;
	static int Id  = 2001; 
	
	public static void read() {
		System.out.println("I am reading Java book ");
		
	}
		
}

public class NonAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book (); 
		
		System.out.println("Accessing final varibale: " + b.a);
		System.out.println("Static variable: " + Book.bookName ); // Accessing static variable
		System.out.println("Accessing final variable: "+ Book.bookId); // Accessing static variable
		System.out.println("Accessing  Id : "+ Book.Id);  //Accessing static variable
		
		Book.read() ;  //Accessing static method	
		
		
	}

}
