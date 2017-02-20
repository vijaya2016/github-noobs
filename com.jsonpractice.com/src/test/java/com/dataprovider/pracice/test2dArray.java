package com.dataprovider.pracice;
import java.util.Arrays;

public class test2dArray {
	public static void main(String args[])
	{
	 String[]  a = {"vanai","test","baby"};
		//Arrays.asList(a);
		 String[]  b = {"vanai1","test2","baby3"};
		// Arrays.asList(b);
		 Object[][] o = new Object[3][2];
		 o[0][0 ] =a;
		 o[1][0] = b;
		 System.out.println(o[0][0]);
	
		 for(int i=0;i<2;i++)
		 { System.out.println(o[i][i]);
		 System.out.println(o[i][1]);
		 System.out.println(o[i][0]);
		 System.out.println(o[i][i]);
	
	}
}
}
