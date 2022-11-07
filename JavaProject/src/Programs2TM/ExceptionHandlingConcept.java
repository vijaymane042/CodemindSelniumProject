//12092022

package Programs2TM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingConcept {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
    File file = new File ("c:\text.text "); //import to java.io.File
    file.canRead();
    FileInputStream fis = new FileInputStream (file ); //Add Throws declaration 
	}

}
