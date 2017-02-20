package com.dataprovider.pracice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderSimple2 {
@DataProvider(name = "test2")

	public Object[][] getdata()
	{
		return new Object[][]{{"name","vijaya"},{"test","value"},{"game","testing"}};
	}
@Test(dataProvider = "test2")

	public void getdata(String s,String k)
	{
		System.out.println(s+k);
	}

}

