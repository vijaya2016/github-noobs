package com.jsonpractice.com.com.jsonpractice.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

public class DataProviderTest {
@Test(dataProvider="mydata")
public void DataProviderExample(int i ,String s)
{
System.out.println("" + i + s);	
//System.out.println( s);
}


@DataProvider(name = "dp2", parallel = true)
public Iterator<Object[]> dp2() {
	
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	
    return FluentIterable.from(map.entrySet()).
            
    		
    		.transform(new Function<Map.Entry<Integer, String>, Object[]>() {
                @Override
                public Object[] apply(Map.Entry<Integer, String> input) {
                    return new Object[]{input.getKey(), input.getValue()};
                }
            })
            .iterator();

}

@DataProvider
public FluentIterable<Object[]> mydata()
{
	///return new Object[][] {{1,"vijaya"},{2,"testing"}};
	//Object[][] t = {{1,"vijaya"},{2,"testing"}};
	//return t;
	HashMap<Integer,Integer[]>  hashmap = new HashMap<Integer,Integer[]>();
	hashmap.put(67, new Integer[] {6,8,7});
	hashmap.put(2, new Integer[] {78,65,34});
	hashmap.put(4, new Integer[] {45,21,23});
	hashmap.
	//Iterator itr = hashmap.entrySet().iterator();
	//System.out.println(hashmap.entrySet());
	//return hashmap.entrySet().iterator();
	
	return FluentIterable.from(hashmap.entrySet())
            .transform(new Function<Map.Entry<Integer, String>, Object[]>() {
                @Override
                public Object[] apply(Map.Entry<Integer, String> input) {
                    return new Object[]{input.getKey(), input.getValue()};
                }
            })
            .iterator();
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	
	//FluentIterable.from(hashmap.entrySet()).t

	}
	
	
			
}
	


