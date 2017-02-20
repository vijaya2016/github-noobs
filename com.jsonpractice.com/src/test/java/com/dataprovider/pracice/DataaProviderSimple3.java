package com.dataprovider.pracice;

import java.util.Arrays;

import org.testng.annotations.DataProvider;

public class DataaProviderSimple3 {
@DataProvider(name="testme")
public Object[][] getData()
{
	 String[]  a = {"vanai","test","baby"};
	Arrays.asList(a);
	 String[]  b = {"vanai1","test2","baby3"};
	 Arrays.asList(b);
	 Object[][] o = new Object[3][2];
	 o[0][0 ] =a;
	 o[1][0] = b;
	 return o;
			 
}
}
