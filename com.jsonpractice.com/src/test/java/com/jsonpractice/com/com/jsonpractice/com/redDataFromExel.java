package com.jsonpractice.com.com.jsonpractice.com;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class redDataFromExel {
public static void maian(String ars[]) throws IOException
{
	FileInputStream fs = new FileInputStream(new File("c:\testme.xlsx"));
	HSSFWorkbook hf = new HSSFWorkbook(fs);
	HSSFSheet hs = hf.getSheetAt(0);
	FormulaEvaluator fe = hf.getCreationHelper().createFormulaEvaluator();
	for(Row row : hs)
	{
		for(Cell cell:row){
			switch(fe.evaluateInCell(cell).getCellType())
			{
			case Cell.CELL_TYPE_NUMERIC :
				System.out.println(cell.getNumericCellValue() + "\t\t");
				break;
			case Cell.CELL_TYPE_STRING :
				System.out.println(cell.getStringCellValue()+ "\t\t");
				break;
			
			}
			
		}
			
	}
	
	
}
	
	
}
