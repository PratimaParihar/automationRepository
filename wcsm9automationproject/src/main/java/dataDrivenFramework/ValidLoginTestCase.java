package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://pratima-3010/login.do");
		
		//To read username data from excel file
		FileInputStream fis = new FileInputStream("./src/main/resources/ActiTime_TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("validCreds");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		
		String usnData = cell.getStringCellValue();
		
		//To read password data from excel file
		
		FileInputStream fis1 = new FileInputStream("./src/main/resources/ActiTime_TestData.xlsx");
		
		
		Workbook wb1 = WorkbookFactory.create(fis1);
		
		Sheet sheet1 = wb.getSheet("validCreds");
		
		Row row1 = sheet1.getRow(1);
		
		Cell cell1 = row.getCell(1);
		
		String pwdData = cell1.getStringCellValue();
		
		driver.findElement(By.name("username")).sendKeys(usnData);
		driver.findElement(By.name("pwd")).sendKeys(pwdData);
		driver.findElement(By.id("loginButton")).click();
	}
}
