package com.jsonpractice.com.com.jsonpractice.com;

import java.util.HashMap;
import java.util.Map;

public class CountWordFrequency {
	public static void main(String args[])
	{
		Map<String,Integer> hm = new HashMap<String,Integer>();
		String s ="if it is to be it is up to me to delegate";
		String sa[] = s.split("\\s");
		for(String k : sa)
		{
			Integer y  = hm.get(k);
			 hm.put(k, (y == null) ? 1 : y + 1);
				
		}
		System.out.println(hm);
		
	}

}
