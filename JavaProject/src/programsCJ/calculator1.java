package programsCJ;


  public class calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int multiplication, substraction;
		BasicCalculator cal = new BasicCalculator();
		
		//Object
		
		cal.addition();
		
		multiplication = cal.multiplication();
		System.out.println("Multiplication: "+ multiplication);
		
		substraction = cal.substraction(20, 30);
		System.out.println("Substraction: "+ substraction);
		
		cal.division(100, 2);

		

	}

}
