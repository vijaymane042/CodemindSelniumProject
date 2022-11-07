//24092022
//Eg Flipkart


package CollectionsInJava;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetInterFaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>Prices = new ArrayList<>();
		Prices.add(10);
		Prices.add(20);
		Prices.add(40);
		Prices.add(50);
		 System.out.println(Prices);
		
		Set<Integer>set = new TreeSet<>(Prices);
		ArrayList<Integer>Prices1 = new ArrayList<>(set);
        System.out.println(Prices.equals(Prices1));

		

	}

}
