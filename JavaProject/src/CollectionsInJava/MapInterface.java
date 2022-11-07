//26092022


package CollectionsInJava;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		HashMap<Integer,String>HashMap = new HashMap<>();            //HashMap=Refernce 
		 HashMap.put(2210, "India");
		 HashMap.put(2211, "America");
		 HashMap.put(2212, "ABC");
		 HashMap.put(2211, "ABCD");
		 HashMap.put(4, "EFG");
		 HashMap.put(6, null);
		 HashMap.put(null, null);
		 
		System.out.println(HashMap.get(4));
		System.out.println(HashMap.get(2211));
		
		Set<Entry<Integer, String>> entry = HashMap.entrySet();
		for (Entry<Integer, String> e : entry) {
			System.out.println(e.getKey()+ " : " +e.getValue());
	}

}
}