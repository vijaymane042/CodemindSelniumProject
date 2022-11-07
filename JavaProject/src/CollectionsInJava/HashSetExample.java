//26092022
//Hashset, Treeset

package CollectionsInJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet
		 HashSet<Integer>prices = new HashSet<>();
		 prices.add(10); 
		 prices.add(20);
		 	prices.add(50);
		 	prices.add(40);
		 	prices.add(50);
		 	prices.add(null);
		 
		  Iterator<Integer>it1=prices.iterator();
		  while (it1.hasNext()) {
		  
		  System.out.println(it1.next()); }
		 
//Treeset
		Set<Integer> prices2 = new TreeSet<>();
		prices2.add(100);
		prices2.add(200);
		prices2.add(500);
		prices2.add(400);
		prices2.add(500);
        prices2.add(null);
		Iterator<Integer> it = prices2.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());

		}

		//LinkedHashSet
		Set<Integer> prices1 = new LinkedHashSet<>();
		prices1.add(101);
		prices1.add(202);
		prices1.add(502);
		prices1.add(402);
		prices1.add(502);
        prices1.add(null);
		Iterator<Integer> iter = prices1.iterator();
		while (iter.hasNext()) {

			System.out.println(iter.next());
		}
	}
}
