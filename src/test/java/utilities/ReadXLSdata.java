package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadXLSdata {
public static void main (String[]args) throws EncryptedDocumentException, IOException {
	ReadXLSdata red = new ReadXLSdata();
	red.getData("Sheet1");
}

public String[][] getData(String excelsheet) throws EncryptedDocumentException, IOException {
	File f = new File (System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\testdata.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = WorkbookFactory.create(fis); 
	Sheet sheetname = wb.getSheet(excelsheet);
	
	int totalrows = sheetname.getLastRowNum();
	System.out.println(totalrows);
	Row rowcells = sheetname.getRow(0);
	int totalCols = rowcells.getLastCellNum();
	System.out.println(totalCols);
	
	DataFormatter format  = new DataFormatter();
	
	String testData[][] = new String[totalrows][totalCols];
	for (int i=1; i<=totalrows; i++)
	{ for (int j=0; j<totalCols; j++) {
		testData[i-1][j] = format.formatCellValue(sheetname.getRow(i).getCell(j));
		System.out.println(testData[i-1][j]);
	}
		
	}
	return testData;
	
}
}
