package Programs2TM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionConcept {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String str = "12345 abc";
        str.charAt(8) ;
        
        int num = Integer.parseInt(str);                    //integer.parseInt 
        System.out.println(num);
        File file = new File (" c:\text1.text");            //import to java.io.file 
        
        ExceptionConcept exceptionConcept = null ;
        exceptionConcept.equals("d");
        file.canRead();
        try {
        FileInputStream fist = new FileInputStream(file);  // import java.io.FileInputStream;&//throws FileNotFoundException 
        String str1 = null ;
        str.length() ;
        }    
  //      catch(Exception n)
  //  {
//	}
//        catch (FileNotFoundException e)
//        {
//        	System.out.println("Please insert proper file path ");
//        }
        catch(Exception e)
        {
        	System.out.println(" Null pointer exception handled ");
        }
         catch(Throwable t)
        {
        	System.out.println(" Exception is handled by throwable");
        }
         finally
        {
        	System.out.println(" Finally block executed successfully");
        }
   
        
        
        
	}
}
	



