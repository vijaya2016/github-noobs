package com.jsonpractice.com.com.jsonpractice.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.testng.Reporter;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class HashMapsAsDataLazy {
	 private Collection<String> values;
	    private String testName;

	    @Test (dataProvider = "insideDp")
	    public void testMethod(String eachValue) {
	        Reporter.log(testName + " has its value was " + eachValue, true);
	    }

	    @DataProvider (name = "insideDp")
	    public Object[][] getMoreData() {
	        Object[][] testData = new Object[values.size()][1];
	        int i = 0;
	        for (String eachValue : values) {
	            testData[i++][0] = eachValue;
	        }
	        return testData;
	    }

	    @Factory (dataProvider = "dp")
	    public HashMapsAsDataLazy(String testName, Collection<String> values) {
	        this.values = values;
	        this.testName = testName;
	    }

	    @DataProvider (name = "dp")
	    public static Object[][] getData() {
	        Map<String, String> object1 = new HashMap<>();
	        object1.put("height", "5.5 ft");
	        object1.put("weight", "45 kgs");

	        Map<String, String> object2 = new HashMap<>();
	        object2.put("age", "2");
	        object2.put("weight", "45 kgs");

	        Map<String, String> object3 = new HashMap<>();
	        object3.put("color", "brown");
	        object3.put("orientation", "portrait");

	        return new Object[][] {
	            {"object1", object1.values()},
	            {"object2", object2.values()},
	            {"object3", object3.values()}
	        };
	    }
}
