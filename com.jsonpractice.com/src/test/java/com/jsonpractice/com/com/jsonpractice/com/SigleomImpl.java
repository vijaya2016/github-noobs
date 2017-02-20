package com.jsonpractice.com.com.jsonpractice.com;

public class SigleomImpl {
	private static SigleomImpl impl;
	int k;
	String s;
	//SingleomImpl k = new SingleomImpl();
	private void SigleomImpl()
	{
		System.out.println("Privae Constructor");
	}
//private static SingleomImpl  s= null;
	
//public SigleomImpl getInstance()
//{
//	if (impl==null)
	//	{ impl = new SigleomImpl();
//return impl;
//}
////	return impl;

public static void main(String args[])
{
//System.out.println(impl.toString());
	//SigleomImpl impl;
	SigleomImpl k = new SigleomImpl();
System.out.println(impl);	
}
}
