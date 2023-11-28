package pageObjectModel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp=new LoginPage(driver);
		
		Flib flib = new Flib();
		
		int rc=flib.rowCount(EXCEL_PATH, INVALIDCREDS_SHEET);
		
		for(int i=1;i<=rc;i++)
		{
			lp.invalidLogin(flib.readDataFromExcel(EXCEL_PATH, INVALIDCREDS_SHEET, i, 0),flib.readDataFromExcel(EXCEL_PATH, INVALIDCREDS_SHEET, i, 1));
		}
		bt.tearDown();
		
	}

}
