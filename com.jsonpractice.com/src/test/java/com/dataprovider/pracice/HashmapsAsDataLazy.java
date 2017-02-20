package com.dataprovider.pracice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
public class HashmapsAsDataLazy {
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
    public HashmapsAsDataLazy(String testName, Collection<String> values) {
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
