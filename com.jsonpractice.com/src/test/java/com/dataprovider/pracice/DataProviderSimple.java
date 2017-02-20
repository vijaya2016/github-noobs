package com.dataprovider.pracice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSimple {
	@DataProvider(name = "2darray")
		public 	Object[][]  returndata()
	{
		return new Object[][]{{2,3},{4,5},{5,6}};
	}
	@Test(dataProvider = "2darray")
	public void display(int x ,int y )
	{
	
	System.out.println(x);
	System.out.println(y);
	System.out.println();
	
	}

}
