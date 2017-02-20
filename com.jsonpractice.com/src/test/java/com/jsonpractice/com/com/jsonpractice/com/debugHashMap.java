package com.jsonpractice.com.com.jsonpractice.com;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class debugHashMap {
	public static void main(String args[])
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"vijaya");
		hm.put(2, "srini");
		hm.put(3, "varali");
		hm.put(4, "kushi");
		Set<Entry<Integer, String>> s = hm.entrySet();
		System.out.println(s);
				
		
	}

}
