//23092022


package packagesnew;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistMethodR2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		a.add(01);
		a.add(02);
		
		a.set(1, 4);
		System.out.println("Integer: a:" + a);
		
		a.size();
		System.out.println(a.size());

		a.contains(01);
		System.out.println(a.contains(01));                            //True ,False 

		a.isEmpty();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		System.out.println("Integer: arrayList :" + arrayList);

		arrayList.addAll(a);
		System.out.println(arrayList.addAll(a));

		arrayList.remove(3);
		System.out.println(arrayList.remove(3));
		// arrayList.removeAll(a);

		arrayList.addAll(a);

		List<Integer> list = (List<Integer>) arrayList.clone();         //Same copy 
		
		ArrayList<Integer>b = (ArrayList<Integer>) a.clone();
		for (Integer i : b)
			System.out.println(i);
		
		list.size();
		
		Iterator<Integer>it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
