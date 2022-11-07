//27092022


package CollectionsInJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, String> hashmap = new LinkedHashMap<>();
		hashmap.put(2210, "India");
		hashmap.put(2211, "America");
		hashmap.put(2212, "ABC");
		hashmap.put(2211, "ABCD");
		hashmap.put(4, "EFG");
		hashmap.put(6, null);
		hashmap.put(null, null);

		System.out.println(hashmap.get(4));

		Set<Entry<Integer, String>> entry=hashmap.entrySet();
		for (Entry<Integer, String> e : entry) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
