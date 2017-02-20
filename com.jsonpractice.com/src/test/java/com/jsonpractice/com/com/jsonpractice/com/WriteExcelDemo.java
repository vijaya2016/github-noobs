package com.jsonpractice.com.com.jsonpractice.com;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelDemo {
public static void main(String args[])
{
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("Employee Data");
	Map<String,Object[]> data = new TreeMap<String,Object[]>();
	data.put("11", new Object[]{"ID","Vijaya","Rondla"});
	data.put("22", new Object[]{1,"Srinivas","Goli"});
	data.put("31", new Object[]{2,"Vara","Goli"});
	data.put("14", new Object[]{3,"Kushal","Goli"});
	//System.out.println(data);
Set<String> keyset = data.keySet();
Iterator itr = keyset.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	//System.out.println(itr.next().toString());
	//System.out.println(data.get(keyset.));
}
System.out.println("vijahghsgg");
System.out.println(keyset.size());
int rownum=0;
for(String Key:keyset )
{
	Row row = sheet.createRow(rownum++);
		Object []	objArr = data.get(Key);
		int cellnum=0;
		for(Object obj :objArr)
		{
			Cell cell = row.createCell(cellnum++);
			if( obj instanceof String)
			cell.setCellValue((String)obj);
			else if(obj instanceof Integer)
				cell.setCellValue((Integer)obj);
				
		}
		
}
try
{
	FileOutputStream out = new FileOutputStream(new File("c:\\howodoinjav_demo.xlsx"));
	workbook.write(out);
	out.close();
	System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
	}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
