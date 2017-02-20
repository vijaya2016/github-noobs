package com.jsonpractice.com.com.jsonpractice.com;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;

public class ReadDataJexcel {
	 @Test(dataProvider="DP")
	 public void sales_coupon_count(String username,String password)
	 {
	   
	   System.out.println("The value of username" + username);
	   System.out.println("The value of password" + password);
	 
	 }
	 @DataProvider(name="DP")
	 public String[][] readExcel(  )
	 {
	 File file = new File("howodoinjava_demo.xlsx");
	 String inputData[][] = null;
	 Workbook w;
	  
	 try {
	   w = Workbook.getWorkbook(file);
	   
	   // Get the first sheet
	   Sheet sheet = w.getSheet(0);
	       
	   int colcount=sheet.getColumns();
	   
	   int rowcount=sheet.getRows();
	  
	   inputData= new String[rowcount][colcount];
	   
	   for ( int i=0;i<sheet.getRows();i++)
	   {
	    for (int j=0;j<sheet.getColumns();j++)
	    {
	     Cell cell=sheet.getCell(j,i);            
	     inputData[i][j]=cell.getContents();            
	    }        
	   }  
	   } catch (BiffException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	   } catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();          
	   }
	   return inputData;
	 }
	}

