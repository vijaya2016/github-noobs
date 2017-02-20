package com.strings.pracice;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings2DArray {
	public static void main(String args[])
	{
	
	ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();
	ArrayList<String> s = new ArrayList<String>();
	s.add("vanai");
	s.add("test");
	s.add("mami");
	s.add("cjsdhcfh");
	ArrayList<String> n = new ArrayList<String>();
	n.add("vanai12");
	n.add("test2");
	n.add("mami4");	
	arrayList.add(n);
	arrayList.add(s);
		 
	String[][] array = new String[arrayList.size()][];
	for (int i = 0; i < arrayList.size(); i++) {
	    ArrayList<String> row = arrayList.get(i);
	  // System.out.println( row.get(i));
	    array[i] = row.toArray(new String[row.size()]);
	  //  System.out.println(array[i].length);
	}
	System.out.println(array[0][0]);
	System.out.println(array[0][1]);
	System.out.println(array[0][2]);
	//System.out.println(array[0][3]);
	System.out.println(array[1][0]);
	System.out.println(array[1][1]);
	System.out.println(array[1][2]);
	//System.out.println(array[0][3]);
	//System.out.println(row.);
}
}
// i=2; row = vani,test,maami;
//array[0] = 