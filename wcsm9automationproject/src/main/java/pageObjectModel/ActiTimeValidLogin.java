package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//get webelement from login paage
		
		LoginPage lp = new LoginPage(driver);
		
		//read data from property file
		
		Flib flib = new Flib();
		lp.validLogin(flib.readDataFromProperty(PROP_PATH, "username"),flib.readDataFromProperty(PROP_PATH, "password"));
		Thread.sleep(2000);
		bt.tearDown();
	}

}
