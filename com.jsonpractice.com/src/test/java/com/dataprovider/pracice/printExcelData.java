package com.dataprovider.pracice;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

public class printExcelData{
@Test(dataProvider = "exceldata",dataProviderClass =ExcelReader0214.class)
public void Printme(HashMap<Integer,ArrayList<ArrayList<String>>> hm )
{
	System.out.println("sucess");
}
}
