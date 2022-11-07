//22092022
//heterogenous 


package packagesnew;

import java.util.ArrayList;
import java.util.List;

public class HeterogenousListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList ();
		list.add(10);
		list.add('C');
		list.add("String");
		for (Object ob:list)             //Enhanced /Advanced/for each  Loop 
		{
          System.out.println(ob);        //If 
	}

}
}