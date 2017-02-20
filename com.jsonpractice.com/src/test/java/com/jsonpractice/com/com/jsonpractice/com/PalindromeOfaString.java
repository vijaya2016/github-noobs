package com.jsonpractice.com.com.jsonpractice.com;

import java.util.ArrayList;

public class PalindromeOfaString {
	public static void main(String args[])
	{
		String s = "Srinivas is a good boy";
		ArrayList<String> AL = new ArrayList<String>();
		int k=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ' ){
				AL.add(s.substring(k, i));
				k=i;
				
			}
			//System.out.println(AL);
		}
		System.out.println(AL);
		char[] c= {'d',4,5,'l'};
		s.
	}

}
