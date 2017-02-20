package com.jsonpractice.com.com.jsonpractice.com;

public class SringIntegerCharacter {
	public static void main(String args[])
	{
	String character = "false";
	char c = character.charAt(0);
	char[] data = {'d','j','7','8','k','l'};
	System.out.println(Long.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Short.MIN_VALUE);
	System.out.println(Byte.SIZE);
	System.out.println(Boolean.parseBoolean(character) + "vijaya");
	System.out.println(Integer.MIN_VALUE);
	System.out.println(String.valueOf(data) +"vijya data String");
	
	if (Character.isDigit(c)) { 
	   System.out.println(c+ "is  digit");
	} else if (Character.isLetter(c)) {
	   System.out.println(c+ "is a letter");
	}
	}
}
