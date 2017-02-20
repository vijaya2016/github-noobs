package com.jsonpractice.com.com.jsonpractice.com;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.*;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class student  {

int id;

class marks
{
	String course;
	String days[ ];
	}


public static void main(String args[])
{
	HashMap<String,testme> hm = new HashMap<String, testme>();
	//XSSFWorkbook workbook = new XSSFWorkbook(); 
	HSSFWorkbook wb = new HSSFWorkbook();
	Sheet sheet = wb.createSheet("new sheet");
    Row row = sheet.createRow((short)2);
    row.createCell(0).setCellValue(1.1);
    row.createCell(1).setCellValue(new Date());
    row.createCell(2).setCellValue(Calendar.getInstance());
    row.createCell(3).setCellValue("a string");
    row.createCell(4).setCellValue(true);
    
	
}

}

