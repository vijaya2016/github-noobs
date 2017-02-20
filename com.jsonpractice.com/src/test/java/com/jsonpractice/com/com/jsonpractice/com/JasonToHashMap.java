package com.jsonpractice.com.com.jsonpractice.com;


	import java.io.File; 
import java.io.IOException; 
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonFactory;
	import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

	public class JasonToHashMap { 
	    public static void main(String argv[]) { 
	        try { 
	        	JasonToHashMap jsonExample = new JasonToHashMap(); 
	            jsonExample.testJackson(); 
	        } catch (Exception e){ 
	            System.out.println("Exceptione"); 
	        }        
	    } 
	    public void testJackson() throws IOException {        
	      // JsonFactory factory = new JsonFactory(); 
	        ObjectMapper mapper = new ObjectMapper(); 
	        File from = new File("C:\\json examples\\album.txt"); 
	        TypeReference<HashMap<String,Object>> typeRef 
	              = new TypeReference< 
	                     HashMap<String,Object> 
	                   >() {}; 
	        HashMap<String,Object> o 
	             = mapper.readValue(from, typeRef); 
	       //System.out.println("got" +  o); 
	      System.out.println( o.entrySet());
	       // System.out.println(o.get("artists"));
	    }   

	}

