
      //Local varibles are declared in inside methods called as a formal arguments 

package programsCJ;

class Employee {
	
	int eid = 2002;  //Default access modifier
	public float salary = 30000.56f; // Public access modifier
	private long mob = 9856456314L; // Private access modifier	
	
	public void displayMobile()  {
		System.out.println("Default access modifier : " + eid );
		System.out.println("Public access modifier : " + salary );
		System.out.println("Private Mobile number : " + mob );
		
	}
}


public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee() ;
		
		System.out.println("Employee id : " + emp.eid);  //Accessing default variable 
		System.out.println("Employee salary of eid : " + emp.eid + "is : " + emp.salary );  //Accessing public variable 
		
		
		//System.out.println("Employee id : " +  emp.mob);  // Accessing private variable 
		
		emp.displayMobile();

		
		

	}

}
