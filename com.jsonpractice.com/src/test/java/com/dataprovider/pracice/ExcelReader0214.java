package com.dataprovider.pracice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

public class ExcelReader0214 {
	@DataProvider(name = "exceldata")
	public static HashMap<Integer,ArrayList<ArrayList<String>>> readExcel(String path) throws IOException
	{
		path = "c:\\excelt.xlsx";
	FileInputStream fis = new FileInputStream(path);
	//System.out.println("testing");
	//try (XSSFWorkbook workbook = new XSSFWorkbook(fis))
	//{
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	//XSSFRow row = sheet.getRow(0);
	Iterator<Row> iterator = sheet.iterator();
    int rows=1;
    //int cols=0;
    
    
    ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
    HashMap<Integer,ArrayList<ArrayList<String>>> hashmap = new HashMap<Integer,ArrayList<ArrayList<String>>>();
    while (iterator.hasNext()) {
        Row nextRow = iterator.next();
        ArrayList<String> all = new ArrayList<String>();
      //  rows=rows+5;
     //   System.out.println(al + "al first");
       all.clear();
     //  System.out.println(al + "al last");
        Iterator<Cell> cellIterator = nextRow.cellIterator();
        while (cellIterator.hasNext()) {
        	
            Cell cell = cellIterator.next();            
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_STRING:
                
                	//System.out.print(cell.getStringCellValue());
                	all.add(cell.getStringCellValue());
                  // cols++;
                    break;
                case Cell.CELL_TYPE_BOOLEAN:
                    all.add(String.valueOf(cell.getBooleanCellValue()));
                   // al.add(cell.)
                    break;
                case Cell.CELL_TYPE_NUMERIC:
                    //System.out.print(cell.getNumericCellValue());
                    all.add(String.valueOf(cell.getNumericCellValue()));
                    break;
            }
            System.out.print(" - ");       
        }
      // System.out.println("hashmap rows to put " + al);
      //  System.out.println(rows + "rows to put");
        al.add(all);
        hashmap.put(rows, al);
        //System.out.println(hashmap);
       // System.out.println( " the hashmap value is " + hashmap);
        System.out.println();
    }
    System.out.println(hashmap.get(1).get(0));
   // for(Entry<Integer, ArrayList<String>> entry: hashmap.entrySet()) {
     //   System.out.println(entry.getKey() + " : " + entry.getValue());

    //}
    workbook.close();
    fis.close();
    System.out.println(hashmap.entrySet().toArray());
    return hashmap;
	} 
  
}
		



