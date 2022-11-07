//24092022

package CollectionsInJava;

import java.util.HashSet;
import java.util.Set;

public class SetINterfaceHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String>set = new HashSet<>();
		set.add("String1");
		set.add("String");
		set.add("String1");                //Set is not allowing duplicate element 
		
		for( String s : set )              //Enhaced for loop 
		{
			System.out.println("Duplicate Elements :" + s +" ");
		}
		
		
		Set<String>set1 = new HashSet<>();
		set1.add("String3");
		set1.add("String2");
		set1.add("String4");                //Set is not maintaning  insertion order  
		
		for( String s2 : set1 )              //Enhaced for loop 
		{
			System.out.println( " " +s2);

		
		
	}

}
}