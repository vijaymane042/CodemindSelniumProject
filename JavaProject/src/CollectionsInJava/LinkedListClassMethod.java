//27092022


package CollectionsInJava;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		
		LinkedList<Integer> linkedList1 = new LinkedList<>();
		linkedList1.add(50);
		linkedList1.add(20);
		linkedList1.add(10);
		linkedList1.add(30);
		linkedList1.add(40);
   
		Iterator<Integer>it =linkedList1.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		Collections.sort(linkedList1);
		System.out.println("List after sorting ");
		Iterator<Integer>it1 = linkedList1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		Collections.reverse(linkedList1);
		System.out.println(" List after reverse become in descending ");
		Iterator<Integer>it2 = linkedList1.iterator();
		while(it.hasNext()) 
		{
		System.out.println(it2.next());
		
		
	}
	
	System.out.println("Max  from list is");
	System.out.println(Collections.max(linkedList1));
	
	System.out.println(" Min from list is");
	System.out.println(Collections.min(linkedList1));
	//System.out.println(Collections.(linkedList1));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
