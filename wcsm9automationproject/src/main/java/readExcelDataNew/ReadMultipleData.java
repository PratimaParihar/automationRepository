package readExcelDataNew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//Provide the file path
		FileInputStream fis = new FileInputStream("./src/main/resources/Test_Data.xlsx");
		
		//to make the file Ready to Read
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("IPL");//To get into particular sheet
		
		int rowcount=sheet.getLastRowNum();//To get the no.of row
		
		for(int i=1;i<=rowcount;i++)
		{	
				Row row = sheet.getRow(i);//to get into particular row
				Cell cell = row.getCell(0);//To get into particular column
				String data = cell.getStringCellValue();//to read specific data from a particular cell
				System.out.println(data);
		}
	}
}
