package com.jsonpractice.com.com.jsonpractice.com;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class SingleKeyMultipleValueUsingList {
public static void main(String args[])
{
	//Map<String,List<String>> map = new HashMap<String,ArrayList<String>>();
	   Map<String, List<String>> map = new HashMap<String, List<String>>();
	   List<String> valSetOne = new ArrayList<String>();
	   valSetOne.add("Apple");
	   valSetOne.add("Orange");
	   List<String> valSetTwo = new ArrayList<String>();
	   valSetTwo.add("Bat");
	   valSetTwo.add("Banana");
	   List<String> valSetThree = new ArrayList<String>();
	   valSetThree.add("Cat");
	   valSetThree.add("Cow");
	   map.put("1", valSetOne);
	 //  List<String> valueSetTwo;
	map.put("2", valSetTwo);
	   map.put("3", valSetThree);
	   System.out.println(map.entrySet());
	   Set ent = map.entrySet();
	   System.out.println("vijaaya set ");
	   Set k = map.keySet();
	   System.out.println(map.get("1"));
	   
	   System.out.println(k + "vijaya key set ");
	   System.out.println(ent);
	   System.out.println(map.keySet());
	   System.out.println("Printing the set ");
	   Iterator it = map.keySet().iterator();
			  while(it.hasNext() )
			  {
		ArrayList al =  (ArrayList) map.get(it.next());
		System.out.println(al);
		
			 }
			 // System.out.println(al );
}
}
