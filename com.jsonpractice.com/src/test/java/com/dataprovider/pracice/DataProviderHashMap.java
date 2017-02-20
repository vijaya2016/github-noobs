package com.dataprovider.pracice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

public class DataProviderHashMap {
@DataProvider(name = "dp2", parallel = true)
public Iterator<Object[]> dp2() {
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	hm.put(2, 67);
	hm.put(3, 78);
	hm.put(5, 90);
	System.out.println(FluentIterable.from(hm.entrySet())
            .transform(new Function<Map.Entry<Integer, Integer>, Object[]>() {
                @Override
                public Object[] apply(Map.Entry<Integer,Integer> input) {
                    return new Object[]{input.getKey(), input.getValue()};
                }
            })
            .iterator().next());
    return FluentIterable.from(hm.entrySet())
            .transform(new Function<Map.Entry<Integer, Integer>, Object[]>() {
                @Override
                public Object[] apply(Map.Entry<Integer,Integer> input) {
                    return new Object[]{input.getKey(), input.getValue()};
                }
            })
            .iterator();

}

@Test(dataProvider = "dp2")
public void display(Object[][] o)
{
	//Object t;
	System.out.println("test");
}

}



