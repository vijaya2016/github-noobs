package com.jsonpractice.com.com.jsonpractice.com;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
 
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class JasonJacksonTreeMappingDemo {
	public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
 
        /**
         * Read values from conceptual JSON tree
         */
        JsonNode rootNode = mapper.readTree(new File("C:\\json examples\\greendore.json"));
         
        JsonNode carNode = rootNode.path("name");
                Iterator<JsonNode> itr = carNode.elements();
                while(itr.hasNext()){
                	System.out.println("est");
           System.out.println(itr.next().asText());
         }
        //System.out.println(carNode.asText());
 
        JsonNode priceNode = rootNode.path("price");
        System.out.println(priceNode.asText());
         
       JsonNode modelNode = rootNode.path("id");
        System.out.println(modelNode.asText());
         System.out.println("printing last node");
       JsonNode colorsNode = rootNode.path("tags");
        Iterator<JsonNode> colors = colorsNode.elements();
         
       while(colors.hasNext()){
          System.out.println(colors.next().asText());
        }
         
    }
}

