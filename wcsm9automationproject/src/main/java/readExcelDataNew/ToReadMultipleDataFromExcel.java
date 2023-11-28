package readExcelDataNew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDataFromExcel {
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			//to read multiple data from file
			for(int i=1;i<=10;i++)
			{	
			
			FileInputStream fis = new FileInputStream("./src/main/resources/Test_Data.xlsx");
			//make the file ready to read
			Workbook wb = WorkbookFactory.create(fis);
			//read methods
			Sheet sheet = wb.getSheet("IPL");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			System.out.println(data);
			}
		}
}
