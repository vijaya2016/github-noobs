package com.dataprovider.pracice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

public class CheckFluentIterable {
	
	//@DataProvider(name = "dp2", parallel = true)
	@Test
	public void dp2() {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(2, "test1");
		hm.put(3, "test2");
		hm.put(5, "test3");
	   //Iterator<Object[]> itr = 
			  System.out.println( FluentIterable.from(hm.entrySet())
	            .transform(new Function<Map.Entry<Integer, String>, Object[]>() {
	                @Override
	                public Object[] apply(Map.Entry<Integer, String> input) {
	                    return new Object[]{input.getKey(), input.getValue()};
	                }
	            }).get(2));
	            //.iterator();
	

	}
	
	}
