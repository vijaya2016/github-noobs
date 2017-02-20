package com.jsonpractice.com.com.jsonpractice.com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DictionaryImplementation {
	//take -> carry or bring with onejump -> move suddenly and quickly in a specified waywalk -> an act of traveling or an excursion on foot
	//run -> an act or spell of runningdance -> move in a quick and lively wayhelp -> serve someone withrun -> an act or spell of running
public static void main(String args[])
{
	HashMap<String,String> hl = new HashMap<String,String>();
	List<Entry<K, V>> set;
	Map.Entry<K,V> me = hl.entrySet();
	hl.put("take", "carry or bring with one");
	hl.put("jump", "move suddenly and quickly in a specified way");
	hl.put("walk", "an act of traveling or an excursion on foot");
	String k= "jump";
	if(hl.containsKey(k))
	System.out.println(hl.get(k));
	else hl.put(k, k);
	Set st =hl.entrySet();
}
}
