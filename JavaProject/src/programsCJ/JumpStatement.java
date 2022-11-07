package programsCJ;

public class JumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		//Break Statement
		
		for (i=1;i<=10;i++) {
			if (i>=5) {
				System.out.println("Value of I:" + i++);
				break;
			}else {
				System.out.println("Value of I:" + i);
				
			}
				
		}
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");

		//Contiue Statement
		
		for(i=1;i<=10;i++) {
			if(i>=5) {
				System.out.println("Value of I: " + i);
				continue;
				
			}else {
				System.out.println("Value of I: " + i);
			}
		}
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		System.out.println("Statement 3");

		
		
		
		
	}

}
