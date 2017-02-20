package com.dataprovider.pracice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConvertHashMapToObject 
{
	@DataProvider(name = "GoodData")
	@Test
	public Object[][] getdata()
	{
		Map<Integer, ArrayList<String>> hm = new HashMap<Integer,ArrayList<String>>();
	String[] s1 =new String[] {"vara","vijji","test"};
	ArrayList<String> al = new ArrayList<String>(Arrays.asList(s1));
	String[] s2 =new String[] {"srini","bujji","chitti"};
	ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(s2));
	String[] s3 =new String[] {"nani","kanna","baby"};
	ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(s3));
	hm.put(45, al);
	hm.put(50, al1);
	hm.put(55, al2);
	Object[][] testData = new Object[hm.size()][2];
	
int i=0;
//System.out.println(hm.entrySet());
	for (Map.Entry<Integer, ArrayList<String>> entry : hm.entrySet()) {
	 //   Integer key = entry.getKey();
	 //System.out.println(key);
	   // ArrayList<String> value = entry.getValue();
	   //System.out.println(value);
		testData[i] = new Object[] { entry.getKey(),entry.getValue()};
				i++;
		}
       
//System.out.println(testData[0][0]);
//System.out.println(testData[0][1]);
//System.out.println(testData[1][0]);
//System.out.println(testData[1][1]);
//System.out.println(testData[2][0]);
//System.out.println(testData[2][1]);
return testData;
	}
	
@Test(dataProvider = "GoodData")
public void displaydata(int key ,ArrayList<String> v)
{
	System.out.println(key);
	System.out.println(v);
}
}
	
	

	//values.
//for(int u =o;u<value)
	
