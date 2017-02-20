package com.jsonpractice.com.com.jsonpractice.com;

import java.util.HashMap;

public class TestNow {
	public static void main(String args[])
	{
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	hm.put(2, 67);
	hm.put(3, 78);
	hm.put(5, 90);
	System.out.println(hm);
	//return hm;
	hm.entrySet().toArray();
}
}
