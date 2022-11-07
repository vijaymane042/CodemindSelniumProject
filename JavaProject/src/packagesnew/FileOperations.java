//20092022


package packagesnew;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOperations {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File file = new File ("D:/FileOperationsjava/New folder/test.txt"); //import java.io.File;
	    System.out.println (file.createNewFile());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
		System.out.println(file.exists());
		
	//	try 
	//	{
	//	System.out.println(file.createNewFile());	
	//	}
	//	catch(IOException e)
	//	{
	//		e.printStackTrace();
	//}
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		System.out.println(file.listFiles().length);
		System.out.println(file.delete());
	}
	}

