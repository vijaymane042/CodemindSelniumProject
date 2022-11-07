package programsCJ;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println("ABC");
		System.out.print("EFG");
		System.out.println("HIJ");*/
		
		int i = 0, n = 0;
		String primeNumber = "";
		System.out.println("Prime numbers =s 1 to 100 :");

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (n = i; n >= 1; n--) {
				if (i % n == 0) {
					counter = counter+1;
				}
			}
			if (counter == 2) {
				
				System.out.println(i);
				primeNumber = primeNumber + i + " ";
			}
		}

	}
}
