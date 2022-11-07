//27092022

package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	private static char[] i;

	public static void main(String[] args, char[] i) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> hashMap = new TreeMap<>();
		hashMap.put(1, "Red");
		hashMap.put(5, "Pink");
		hashMap.put(10, "white");
		hashMap.put(6, "Blue");
		hashMap.put(1, "Green");
		hashMap.put(20, "Black");
		//hashMap.put(null, "Red");          //Allowing null value
		//hashMap.put(null, null);           //not null key & value
		hashMap.put(6, null);                //null value but not null key 
        hashMap.put(7, null);
		System.out.println(hashMap.get(10));

		Set<Entry<Integer, String>> entry = hashMap.entrySet();
		for (Entry<Integer, String> e : entry) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		Collection<String> set = hashMap.values();             //key 
		ArrayList<String> arrayList = new ArrayList<>(set);
		Collections.sort(arrayList);
		Collections.reverse(arrayList);
		System.out.println(" *** ");
		for(String i1 : arrayList)                                 //key ,,for (String i:set)
			;
		{
			System.out.println(i);                                     //key

			
			Collection<Integer>set1=hashMap.keySet();
			for(String i2 : set);
			System.out.println(i);
		}
	}
}
