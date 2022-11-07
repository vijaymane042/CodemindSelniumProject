//24092022

//Queue

package CollectionsInJava;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PriorityQueue<String>priorityQueue = new PriorityQueue<>();
    priorityQueue.add("String");
    System.out.println(priorityQueue);
    
    ArrayDeque<Integer>arrayDeque = new ArrayDeque<>() ;
    arrayDeque.add(10);
    System.out.println(arrayDeque);
	}

}
