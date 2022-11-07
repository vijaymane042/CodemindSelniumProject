//21092022


package packagesnew;

import java.io.File;
//import java.io.file;
import java.io.FileWriter;
import java.io.IOException;
public class WritingToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:/FileOperationsjava/txt1.txt ") ;//by creating object file 
		System.out.println(" File created ");
		try
		{
     FileWriter filewriter = new FileWriter(file, true); //false
     filewriter.write(" This is sample Test" );              //new contents //new contents for file 
     filewriter.close();
	}catch ( IOException e){
		e.printStackTrace();
		

		}
     
	}

}
