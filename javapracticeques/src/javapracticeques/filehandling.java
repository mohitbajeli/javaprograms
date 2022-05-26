package javapracticeques;

import java.io.File;
import java.io.IOException;

public class filehandling {

	public static void main(String[] args) {
		File myfile= new File("C:/Users/HP/gitt/javaprograms/javapracticeques/src/javapracticeques/filehandling.txt");
		try {
		myfile.createNewFile();
		}
		catch(IOException e)
		{
			System.out.println("cannot make file");
			e.printStackTrace();
		}
	}

}
