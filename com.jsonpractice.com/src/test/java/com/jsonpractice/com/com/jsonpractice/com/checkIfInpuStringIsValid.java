package com.jsonpractice.com.com.jsonpractice.com;

import java.util.Enumeration;
import java.util.Stack;

public class checkIfInpuStringIsValid {
public static void main(String aars[])
{
	String s = ")({.}[,]";
	char[] c = s.toCharArray();
	Stack<Character> St = new Stack<Character>();
	
	for(int i =0;i<c.length;i++)
	{
	St.push(c[i]);
	}
	//Character c = St.pop();
	int check=0;
	
	
	for(int i =0;i<St.size();i++)
	{
		Character cc = St.pop();
		switch(cc)
		{
		case '(' : if(St.elementAt(i+1)==')')
			       check=1;
		           break;
		case '{' : if(St.elementAt(i+1)=='}')
			       check=1;
		           break;
		case '[' : if(St.elementAt(i+1)==']') 
			       check=1;
		           break;
		default  : check=0;
		           break;
		           
	}
	if(check==0)
		break;
}
	if(check==1)
		System.out.println("the String is valid \n");
	else 
		 System.out.println("the String is invalid ");
}
}
