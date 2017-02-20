package com.jsonpractice.com.com.jsonpractice.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializaation {
	private File file = new File("C:\\serial.txt");
	FooballPlayer fb = new FooballPlayer();
	public static void main(String args[]) throws IOException
	{
		
		serializaation serialization = new serializaation();
		serialization.init();
	//	serialization.read();
		serialization.write();
	
		FooballPlayer fb = new FooballPlayer();
}

	public void init()
	{
	//	file = new File("data");
		fb = new FooballPlayer();
		fb.setName("vijaya");
		fb.setPosition("player");
		fb.setNationality("Indian");
		fb.setClub("test");
		
				
	}
 // public void read()
   //{
	  
	 //  ObjectOutputStream oos;
	//try {
	//	FileInputStream fis = new  FileInputStream(file);
	//	ois = new ObjectInputStream(fis);
		//FileOutputStream fos = new  FileOutputStream(file);
	//} catch (FileNotFoundException f) {
		//f.printStackTrace();
	//}
	  //catch(IOException e){
		//  e.printStackTrace();
	  //}
   //}
  public void write() throws IOException
   {
	   FileOutputStream fos = new  FileOutputStream(file);
	   ObjectOutputStream oos = new ObjectOutputStream(fos);
	   oos.writeObject(fb);
	   
	   oos.close();
   }
}


