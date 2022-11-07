//24092022


package CollectionsInJava;

import java.util.Set;
import java.util.TreeSet;
public class TreeSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<String>se = new TreeSet<>();

		Set<String>set = new TreeSet<>();
		set.add("String1");
		set.add("String0");
		set.add("String5");                //Set is not maintaning  ascending order  
		set.add("String9");
		set.add("String4");

		for( String s : set )              //Enhanced for loop 
		{
			System.out.println("Ascending order :" + s +" ");
		}


	}

}
