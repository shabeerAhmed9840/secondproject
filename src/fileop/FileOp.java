package fileop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOp {
	public static void main(String[] args) throws IOException {
		
		// to create a file
		File f=new File("E:\\Javafile\\java2\\fileno1.txt");
	boolean b=f.createNewFile();
		System.out.println(b);
		
	/*	if(f.exists()) {
			System.out.println("file name:" + f.getName());
			System.out.println("Absolute path:" + f.getAbsolutePath());
			System.out.println("Writeable" + f.canWrite());
			System.out.println("can readable" + f.canRead());
			System.out.println("file size" + f.length());
		}
		else {
			System.out.println("file does not exist");
		}*/
		//Method to write on a file 
		FileWriter write=new FileWriter("E:\\Javafile\\fileno1.txt");
		write.write("java is cool");
		write.close();
		System.out.println("file writeable");
		
		
		//doubt
		/*try
		{File f2=new File("E:\\Javafile\\fileno1.txt");	
		Scanner s=new Scanner(f2);
		While (s.hasNextLine()) {
			String text=s.nextLine();
			System.out.println(text);
		}
		s.close();
		*/
		
		boolean b1=f.mkdirs();
		System.out.println(b1);
		// to check whether file is in file format or not 
		boolean b3=f.isFile();
		System.out.println(b3);
		//to check whether file is folder or not 
		boolean b4=f.isDirectory();
				System.out.println(b4);
		//to check whether file is readable or not 		
		boolean b5=f.canRead();
		System.out.println(b5);
	    //to check whether file is writable or not 
		boolean b6=f.canWrite();
		System.out.println(b6);
		//to check whether file is hidden or not
		boolean b7=f.isHidden();
				System.out.println(b7);
				
	 			
				
				
		 //to check show all file ======doubt		
				
	   /* String []i=f.list();
	    for(String x:i) {
	    	System.out.println(x);
	    	
	    }*/
				
	     			
				
	    			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
