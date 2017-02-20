package com.jsonpractice.com.com.jsonpractice.com;

import java.util.HashMap;
import java.util.Stack;

public class checkParanthesis {
	public static boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();
	}
	
	public static void main(String args[])
	{
		boolean b = checkParanthesis.isValid("(){[]");
		if(b)
			System.out.println("The String is valid");
		else 
			System.out.println("The String is not valid ");
		
	}
}
