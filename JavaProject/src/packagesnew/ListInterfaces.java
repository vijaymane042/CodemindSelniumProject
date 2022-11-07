//22092022
//Homogeneous 

package packagesnew;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List list = new ArrayList ();            //Parent Interface 
        List<Integer>list = new ArrayList<Integer>();
           list.add(10);
           list.add(20);
           list.add(30);
           list.add(40);               //Lsit 
           list.add(30);             //Allow to store insertion order 
           list.add(20);                   //Allow to store Duplicate object/eelement 
           list.add(null);                        //Allow to store null value  
         // Object[] array = list.toArray();
           
          for (Integer i : list) {
        	 System.out.println( i);
        	 

          //   List1<Character>list1 = new ArrayList1<Character>();
           //  list.add("Pink");
            // list.add("Red");
           //  for (Character c :list1){
           //  System.out.println("Character");
          
          }        
	}

}

