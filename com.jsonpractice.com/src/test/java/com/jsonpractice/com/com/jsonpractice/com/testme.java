package com.jsonpractice.com.com.jsonpractice.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.*;
import java.util.regex.Pattern;


public class testme {

String make1[];
String color[];

	public String[] testmer(String make1[], String color[])
	{
		String make11[]={"honda","toyota","acura"};
		//String color1[]= {"black","white","red"};
		return make11;
	}

//car c;

public static void main(String args[])
{
	HashMap<String,testme> hm = new HashMap<String, testme>();
	
	//testme t = new testme("honda","black");
	//System.out.println(t.color);
	//System.out.println(t.make);
	
	//hm.put("car1",new testme("toyota","white"));
	//hm.put("car2", new testme("honda","black"));
	Set<Entry<String, testme>> sk = hm.entrySet();
	
	Iterator<Entry<String, testme>> iterator = hm.entrySet().iterator() ;

    while(iterator.hasNext()) {
    	
    	Map.Entry<String,testme> entry = (Map.Entry<String,testme>) iterator.next();
		String k =  entry.getKey();
	//	testme v= entry.getValue();
		String s = entry.getValue().color+ entry.getValue().make ;
		System.out.println( s);
		System.out.println(k);
		
    	//System.out.println("Key : " + entry);
    	//System.out.println("Key : " + entry.getValue().make);
    }
    testme tm=(testme)hm.get("car1");
   System.out.println(tm);
   //@Override
  // public String toString()
   //{
    //  return "item: "+make+ "price: "+color;
   	//return "itemprice";
   //  }
	
    }
}



