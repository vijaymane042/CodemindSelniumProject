//23092022


package packagesnew;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Integer>linkedList=new LinkedList<>();
     linkedList.add( 10);
     linkedList.add( 20);
     linkedList.add( 40);
     linkedList.add( 30);

     Iterator<Integer>it=linkedList.descendingIterator();
     while (it.hasNext())
     {
     System.out.println(it.next());
	}

}
}