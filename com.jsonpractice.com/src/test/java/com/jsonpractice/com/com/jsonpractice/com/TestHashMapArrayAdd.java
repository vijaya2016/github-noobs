package com.jsonpractice.com.com.jsonpractice.com;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapArrayAdd {
		     public static void main(String [] args)
	     {
	        Map<String, Integer[]> prices = new HashMap<String, Integer[]>();

	        prices.put("milk", new Integer[] {1, 3, 2});
	        prices.put("eggs", new Integer[] {1, 1, 2});
	        System.out.println(prices);
	     }
	}

