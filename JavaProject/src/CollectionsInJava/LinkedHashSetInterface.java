//24092022


package CollectionsInJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set<String>set = new LinkedHashSet<>();

		Set<String>set = new LinkedHashSet<>();
		set.add("String1");
		set.add("String0");
		set.add("String5");                //Set is not maintaning  insertion order but not always 
		set.add("String2");
		set.add("String4");

		for( String s : set )              //Enhaced for loop 
		{
			System.out.println("Duplicate Elements :" + s +" ");
		}
		
		
	}

}
