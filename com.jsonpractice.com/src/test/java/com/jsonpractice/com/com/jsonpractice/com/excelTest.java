package com.jsonpractice.com.com.jsonpractice.com;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		    //Blank workbook
		    XSSFWorkbook workbook = new XSSFWorkbook();

		    //Create a blank sheet
		    XSSFSheet sheet = workbook.createSheet("Employee Data");

		    //This data needs to be written (Object[])
		    Map<String, Object[]> data = new TreeMap<String, Object[]>();
		    data.put("1", new Object[]{"ID", "NAME", "LASTNAME"});
		    data.put("2", new Object[]{1, "Amit", "Shukla"});
		    data.put("3", new Object[]{2, "Lokesh", "Gupta"});
		    data.put("4", new Object[]{3, "John", "Adwards"});
		    data.put("5", new Object[]{4, "Brian", "Schultz"});

		    //Iterate over data and write to sheet
		    Set<String> keyset = data.keySet();

		    int rownum = 0;
		    for (String key : keyset) 
		    {
		        //create a row of excelsheet
		        Row row = sheet.createRow(rownum++);

		        //get object array of prerticuler key
		        Object[] objArr = data.get(key);

		        int cellnum = 0;

		        for (Object obj : objArr) 
		        {
		            Cell cell = row.createCell(cellnum++);
		            if (obj instanceof String) 
		            {
		                cell.setCellValue((String) obj);
		            }
		            else if (obj instanceof Integer) 
		            {
		                cell.setCellValue((Integer) obj);
		            }
		        }
		    }
		    try 
		    {
		        //Write the workbook in file system
		        FileOutputStream out = new FileOutputStream(new File("C:\\Personal\\my_personal\\howtodoinjava_demo.xlsx"));
		        workbook.write(out);
		        out.close();
		        System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
		    } 
		    catch (Exception e)
		    {
		        e.printStackTrace();
		    }
		}
		

}
