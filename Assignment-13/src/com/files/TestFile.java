package com.files;
import java.util.Scanner;
import java.io.*;

public class TestFile {
		  FileOutputStream fos=null;
		  public void files(String name) throws IOException 
		  {
			  
			  try {
				  String s=name;
				  String file=s+".txt";
				fos=new FileOutputStream(file);
				byte b[]=s.getBytes();
				fos.write(b);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  finally 
			  {
				  fos.close();
				  
			  }
		  }
		

	}


