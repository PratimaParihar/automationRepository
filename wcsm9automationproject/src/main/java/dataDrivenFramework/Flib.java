package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readExcelData(String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String data = cell.getStringCellValue();
		return data;
	}
	public void writeExcelData(String excelPath, String sheetName, int rowNob, int cellNob, String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//Provide the path of Excel file  
		Workbook wb = WorkbookFactory.create(fis);//Make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//Get into the Sheet
		Row row = sheet.getRow(rowNob);//Get into the desired Row
		Cell cell = row.getCell(cellNob);//Create desired Cell
		cell.setCellValue(data);//Enter the data in created cell
		
		FileOutputStream fos = new FileOutputStream(excelPath);//Provide the path of excel file
		wb.write(fos);//Write the data in the Excel file
	}
	
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);//Provide the path of Excel file 
		Workbook wb = WorkbookFactory.create(fis);//Make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//Get into the Sheet
		int rowCount = sheet.getLastRowNum();//Get the no. of present in sheet
		return rowCount;
	}

}
