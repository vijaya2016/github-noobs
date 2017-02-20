package com.jsonpractice.com.com.jsonpractice.com;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//File testme

public class ReadaingExcelFileaandStoringDataInHashMap {
	
		    public static HashMap loadExcelLines()
	    {
	        // Used the LinkedHashMap and LikedList to maintain the order
	        HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();

	        LinkedHashMap<Integer, List> hashMap = new LinkedHashMap<Integer, List>();

	        String sheetName = null;
	        File file = new File("C:/testme.xlsx");
	        // Create an ArrayList to store the data read from excel sheet.
	        // List sheetData = new ArrayList();
	        FileInputStream fis = null;
	        try
	        {
	            fis = new FileInputStream(file);
	            // Create an excel workbook from the file system
	            XSSFWorkbook workBook = new XSSFWorkbook(fis);
	            // Get the first sheet on the workbook.
	            for (int i = 0; i < workBook.getNumberOfSheets(); i++)
	            {
	                XSSFSheet sheet = workBook.getSheetAt(i);
	                // XSSFSheet sheet = workBook.getSheetAt(0);
	                sheetName = workBook.getSheetName(i);

	                Iterator rows = sheet.rowIterator();
	                while (rows.hasNext())
	                {
	                    XSSFRow row = (XSSFRow) rows.next();
	                    Iterator cells = row.cellIterator();

	                    List data = new LinkedList();
	                    while (cells.hasNext())
	                    {
	                        XSSFCell cell = (XSSFCell) cells.next();
	                        cell.setCellType(Cell.CELL_TYPE_STRING);
	                        data.add(cell);
	                    }
	                    hashMap.put(row.getRowNum(), data);

	                    // sheetData.add(data);
	                }
	                outerMap.put(sheetName, hashMap);
	                hashMap = new LinkedHashMap<Integer, List>();
	            }

	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            if (fis != null)
	            {
	                try
	                {
	                    fis.close();
	                }
	                catch (IOException e)
	                {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
	        }

	        return outerMap;

	    }
		    
		    public static void main(String args[])
		    {
		    	//ReadaingExcelFileaandStoringDataInHashMap hm = new ReadaingExcelFileaandStoringDataInHashMap();
		    	//hm.loadExcelLines();
		    //	ReadaingExcelFileaandStoringDataInHashMap.loadExcelLines();
		    	HashMap<String, LinkedHashMap<Integer, List>> finalMap = ReadaingExcelFileaandStoringDataInHashMap.loadExcelLines();
Iterator<Entry<Integer, List>> it1=finalMap.get("vijaya").entrySet().iterator();
while(it1.hasNext())
{
	 Map.Entry<Integer,List> element = it1.next();
//System.out.println(element.getKey());
//System.out.println(element.getValue());
}

	Set<Entry<String,LinkedHashMap<Integer, List>>>	  setFinal  	= finalMap.entrySet();
	//System.out.println(setFinal.toArray());
	Iterator itr = setFinal.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
		    	//system.out.println(ReadaingExcelFileaandStoringDataInHashMap.loadExcelLines() );
		    }
}




