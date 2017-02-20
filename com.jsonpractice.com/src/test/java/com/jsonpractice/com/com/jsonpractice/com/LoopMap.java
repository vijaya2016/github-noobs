package com.jsonpractice.com.com.jsonpractice.com;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class LoopMap {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("vara", "121");
		map.put("kushi", "675");
		map.put("me", "11");
		map.put("you", "65");
				map.put("key1", "value1");
		map.put("key2", "value2");

		Object[][] twoDarray = new String[map.size()][2];

		Object[] keys = map.keySet().toArray();
		Object[] values = map.values().toArray();

		for (int row = 0; row < twoDarray.length; row++) {
		    twoDarray[row][0] = keys[row];
		    twoDarray[row][1] = values[row];
		}

		for (int i = 0; i < twoDarray.length; i++) {
		    for (int j = 0; j < twoDarray[i].length; j++) {
		        System.out.println(twoDarray[i][j]);
		    }
		}

	}
}
