package com.jsonpractice.com.com.jsonpractice.com;

import java.util.HashMap;

public class test {
	public static HashMap<Integer,String>getdata()
	{
	HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
	hashmap.put(1, "vijaaya");
	hashmap.put(2, "vani");
	hashmap.put(4, "testing");
	//Iterator itr = hashmap.entrySet().iterator();
	//System.out.println(hashmap.entrySet());
	return hashmap;
	}
	
	public static void main(String args[])
	{	
		System.out.println(getdata());

}
}
