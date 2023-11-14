package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/matchData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		
		//create new into excel sheet
		Row row = sheet.createRow(10);
		
		//create new cell
		Cell cell = row.createCell(0);
		//String data = cell.getStringCellValue();
		//write testData 
		cell.setCellValue("pune");
		
		FileOutputStream fos = new FileOutputStream("./src/main/resources/matchData.xlsx");
		wb.write(fos);
	}
}
