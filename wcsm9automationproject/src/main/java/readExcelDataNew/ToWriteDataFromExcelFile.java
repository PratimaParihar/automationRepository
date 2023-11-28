package readExcelDataNew;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataFromExcelFile {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/Test_Data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.createRow(11);
		Cell cell = row.createCell(0);
		cell.setCellValue("INDIA");	
		
		FileOutputStream fos = new FileOutputStream("./src/main/resources/Test_Data.xlsx");
		wb.write(fos);
	}

}
