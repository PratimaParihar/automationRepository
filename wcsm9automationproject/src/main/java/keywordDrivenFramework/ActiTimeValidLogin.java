package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeValidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		//Launch the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		//read the data from property file
		Flib flib = new Flib();
		
		//identify user_name text-box
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readDataFromProperty(PROP_PATH, "username"));
	
		//identify password text-box

		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(flib.readDataFromProperty(PROP_PATH, "password"));
		
		//identify LoginButton
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		bt.closeBrowser();	
	}
}
