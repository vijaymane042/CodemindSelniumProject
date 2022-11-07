package programsCJ;

public class Car {


	public static void main(String[] args) {
		
		 //Creating object of class
				
		Ertiga e = new Ertiga();
		  
		  
		 // Accessing data of member's
		  
		System.out.println("colour "+e.colour);
		String c = e.colour;
		System.out.println(c+" orange");
		System.out.println("model "+e.model);
		System.out.println("seatcapacity "+e.seatcapacity);
		System.out.println("price "+e.price);

		
		
		 //Accessing member functions
		
	    e.driveToPune();
	    e.travellingToGoa();
		
	}

}
