//23092022


package packagesnew;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListMethods {
	  

	public static void main(String[] args){
		// TODO Auto-generated method stub
   ArrayList< Integer>a1 = new ArrayList<>();
           a1.add(01);
           a1.add(02);
           a1.add(03);
           a1.get(2);
           a1.set(1, 4);
           System.out.println("Integer :a ");
           System.out.println(a1);
           
   		ArrayList<Integer> b = (ArrayList<Integer>) a1.clone();
           for (Integer i:b) {
        	   //System.out.println("Integer :b ");
           System.out.println(i);
           }
           a1.size();
           a1.contains(1);
           a1.isEmpty();
   		   Iterator<Integer> it = a1.iterator();
   		   while (it.hasNext());
   		   System.out.println(it.next());
   		   
           ArrayList< Integer>arrayList = new ArrayList<>();
           arrayList.add(10);
           arrayList.add(20);
           arrayList.add(30);
           arrayList.addAll(a1);
         
           arrayList.removeAll(arrayList);
           arrayList.remove(3);
           for (Integer i : arrayList) {
       		   System.out.println(arrayList);

           System.out.println("i");
	}

}
}