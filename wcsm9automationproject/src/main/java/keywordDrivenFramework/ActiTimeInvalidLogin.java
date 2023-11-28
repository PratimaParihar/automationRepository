package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		//to launch browser and close the browser
		BaseTest bt = new BaseTest();
	
		bt.openBrowser();

		//to read the data from excel file 
		Flib flib = new Flib();
		//int rc = flib.rowCount("./src/main/resources/ActiTime_TestData.xlsx","invalidCreds");
		int rc = flib.rowCount("./src/main/resources/ActiTime_TestData.xlsx","invalidCreds");
		for(int i=1; i<=rc; i++)											
		{	
		String invalidUsn = flib.readDataFromExcel("./src/main/resources/ActiTime_TestData.xlsx", "invalidCreds", i, 0);	
		String invalidpPass = flib.readDataFromExcel("./src/main/resources/ActiTime_TestData.xlsx", "inavalidCreds", i, 1);
		
		//identify user_name text-box
		WebElement usnTB = driver.findElement(By.name("username"));
		//usnTB.sendKeys(flib.readDataFromExcel("./src/main/resources/ActiTime_TestData.xlsx", "invalidCreds", i, 0);	);
		//identify password text-box

		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(invalidpPass);
																																																																																																																																													passTB.sendKeys(args);
		//identify LoginButtonp
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		}			
		bt.closeBrowser();
	}

}
