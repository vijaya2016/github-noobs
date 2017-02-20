package com.jsonpractice.com.com.jsonpractice.com;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaders {
			   public static void main(String args[]) throws IOException {  
		      FileInputStream in = null;
		      FileOutputStream out = null;
           //   in = new FileInputStream("c:\\vijaya.txt");
           File   f= new File("c:\\vijaya.txt");
            FileReader fr  = new FileReader(f);
            char[] a = new char[100];
            fr.read(a);
            System.out.println(a );
            System.out.println("and ");
            String s = new String(a);
		      System.out.println(s);
		      String t = String.valueOf(a);
		      System.out.println(t);
		}
		
}