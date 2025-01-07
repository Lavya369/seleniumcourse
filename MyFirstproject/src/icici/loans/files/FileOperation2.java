package icici.loans.files;

import java.io.File;
import java.io.IOException;

public class FileOperation2 
{
	public static void main(String[] args) throws IOException
	{
		//File f = new File("C:/Users/barig/OneDrive/Desktop/testing1/resume2.txt");
		File f = new File(System.getProperty("user.dir")+"/resume2.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		System.out.println(f.getAbsolutePath());

		
		
		
		
		//System.out.println(f.isDirectory());




	}
}
