package com.jsonpractice.com.com.jsonpractice.com;

import java.util.Stack;

import org.testng.Assert;
import org.testng.annotations.Test;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

public class StrinValidity{
@Test
public boolean  StriknValidity() {
String  s = "()[]{}" ;
Stack<Character>  st = new Stack<Character>();
for(int i =0;i<s.length();i++)
{
	char curr = s.charAt(i);
	if(isleftbracaket(curr))
		{st.push(curr);
		i++;
		}
	if(isrihtbracket(curr))
	{
		char temp = st.pop();
		i--;
		if( isPair(curr,temp))
		return true;
		else return false;
	}
}
}
boolean isleftbracaket(char curr)
{
	if(curr=='[' || curr=='{' || curr == '(')
		return true;
	else return false;
}
boolean isrihtbracket(char curr)
{if(curr==']' || curr=='}' || curr == ')')
	return true;
else return false;
	
}

boolean isPair(char left,char right)
{
	if((left=='(' || right ==')') || (left=='{' || right =='}') || (left=='[' || right ==']'))
		return true ;
				else return false;
}

//return true;
}
