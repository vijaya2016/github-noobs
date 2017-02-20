package com.jsonpractice.com.com.jsonpractice.com;

import java.util.HashMap;
import java.util.Set;

public class MyObjectClassSearch {
	public static void main(String a[]){
        
		/*HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "vara");
        hm.put(new Price("Apple", 40), "kushi");
        hm.put(new Price("Orange", 30), "srini");
        printMap(hm);
        Price key = new Price("Banana", 20);*/
        HashMap< String,Price> hm = new HashMap< String,Price>();
        hm.put("vara",new Price("Banana", 20));
        hm.put("kushi",new Price("Apple", 40));
        hm.put("srini",new Price("Orange", 30));
        printMap(hm);
        Price key = new Price("Banana", 20);
        //System.out.println("Does key available? "+hm.containsKey(key));
    }
     
    public static void printMap(HashMap<String, Price> hm){
         
        Set<String> keys = hm.keySet();
    	//Set<Price> keys = hm.entrySet();
        for(String p:keys){
          //  System.out.println(p+"vijaya==>"+hm.get(p));
            System.out.println(hm.get(p));
            //System.out.println(p);
        }
    }
}
 
class Price{
     
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
    @Override
    public String toString(){
       //return "item: "+item+ "price: "+price;
    	return "itemprice";
      }
     
   /* public int hashCode(){
        //System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
      //  System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
     
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }*/
     
    
}
