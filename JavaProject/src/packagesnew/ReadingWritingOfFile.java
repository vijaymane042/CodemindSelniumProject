//21092022

package packagesnew;

import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadingWritingOfFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileWriter fileWriter = new FileWriter(new File("D:/FileOperationsjava/text.txt"));
			fileWriter.write(" new contents for file");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println(" Please mention correct path");
			 e.printStackTrace();
		}
		 System.out.println( "This code after exception ");

	
	FileReader fileReader = new FileReader(new File("D:/FileOperationsjava/text.txt"));
	int i;
	while((i=fileReader.read())!=-1) //Read int 
	{
		System.out.print((char) i);
	}
	fileReader.close();

	
	}	

}