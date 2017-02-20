package com.jsonpractice.com.com.jsonpractice.com;

import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class person {
String name;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getAge() {
	return age;
}

public void setAge(int d) {
	this.age = d;
}

int age;
public String toString()
{
	return("the name is " + name + "the age is " +age);
	
}

public static void main(String args[]) throws IOException
{
	ArrayList<person> al = new ArrayList<person>();
	FileInputStream fs = new FileInputStream(new File("c:\\testme.xlsx"));
	XSSFWorkbook hf = new XSSFWorkbook(fs);
	XSSFSheet hs = hf.getSheetAt(0);
	FormulaEvaluator fe = hf.getCreationHelper().createFormulaEvaluator();
	for(Row row : hs)
	{
		
		person p = new person();
		for(Cell cell:row){
			
			
			switch(fe.evaluateInCell(cell).getCellType())
			{
			case Cell.CELL_TYPE_NUMERIC :
			//	System.out.println(cell.getNumericCellValue() + "\t\t");
				p.setAge((int) cell.getNumericCellValue());
				
				break;
			case Cell.CELL_TYPE_STRING :
			
				p.setName(cell.getStringCellValue());
				
				break;
			
			}
		
			
		}
		System.out.println(p);
		al.add(p);
		System.out.println("\n");	
	
}
}
}
