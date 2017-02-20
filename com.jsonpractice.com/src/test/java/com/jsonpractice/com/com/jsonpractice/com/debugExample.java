package com.jsonpractice.com.com.jsonpractice.com;

public class debugExample {
int i;
int j;
debugExample()
{
	System.out.println("this is empty constructor");
}
debugExample(int i,int j)
{
this.i = i;
this.j = j;
}
public int add(int i,int j)
{
	int k = i+j;
	return k ;
}
public int sub(int i ,int j )
{
	
	int k = i-j;
	return k ;
}

public static void main(String args[])
{
	debugExample d1 = new debugExample(5,2);
	debugExample d2 = new debugExample();
	System.out.println("test1" + d1.add(3, 2));
	System.out.println("test1" + d1.sub(3, 2));
	System.out.println(d2.add(13, 2));
	System.out.println(d2.sub(13, 2));
	
	
}
}
