package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://pratima-3010/login.do");
	
	Flib flib = new Flib();
	int rc = flib.rowCount("./src/main/resources/ActiTime_TestData.xlsx", "invalidCreds");
	
	for(int i=1;i<=rc;i++)
	{
		String usnData = flib.readExcelData("./src/main/resources/ActiTime_TestData.xlsx", "invalidCreds", i, 0);
		String pwdData = flib.readExcelData("./src/main/resources/ActiTime_TestData.xlsx","invalidCreds", i, 1);	
		driver.findElement(By.name("username")).sendKeys(usnData);
		driver.findElement(By.name("pwd")).sendKeys(pwdData);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
	}
	}
}
