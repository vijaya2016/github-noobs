package com.jsonpractice.com.com.jsonpractice.com;

public class SingletonExample {
	static SingletonExample s= null;

protected  SingletonExample()
{
	System.out.println("I'm a private constructor");
}
public static SingletonExample createSingleton()
{
	if(s==null)
s= new SingletonExample();
	return s;}
	

//public static void main(String args[])
//{
	
		//SingletonExample cse = new SingletonExample();
		//cse.createSingleton();
		
	//}
}


