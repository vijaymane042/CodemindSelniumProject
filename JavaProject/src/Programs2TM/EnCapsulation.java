package Programs2TM;

public class EnCapsulation {
	
	int a ;
	
	public int  getA() {
		return a ;
	}	
	public void setA(int a) {
		this.a = a ;
		
		}
	
	


	public static void main(String args[] ) {
		// TODO Auto-generated method stub
		
		EnCapsulation encapsulation  = new EnCapsulation() ;
		encapsulation.setA(10);
		System.out.println(encapsulation.getA());
		
		//encapsulation
	



	}

}

