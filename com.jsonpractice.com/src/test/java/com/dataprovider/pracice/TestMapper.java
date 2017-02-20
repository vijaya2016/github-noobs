package com.dataprovider.pracice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMapper {
	 public static void main(String[] args) {
	        String key = "123AA";
	        List<Double> values = new ArrayList<Double>();
	        values.add(15.0);
	        values.add(3.0);
	        values.add(1.0);

	        //source
	        Map<String, List<Double>> source = new HashMap<String, List<Double>>();
	        source.put(key, values);

	        //target
	        List<TargetObject> target = new ArrayList<>();

	        //transformation logic      
	    }
}
