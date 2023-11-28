package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keywordDrivenFramework.Flib;

public class BaseTest extends Flib implements IautoConstant{
	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flib flib = new Flib();//read data from property file
		//String browserValue = flib.readDataFromProperty("./src/main/resources/config.properties", "browser");
		//String url = flib.readDataFromProperty("./src/main/resources/config.properties", "url");
		
		String browserValue = flib.readDataFromProperty(PROP_PATH, "browser");
		String url = flib.readDataFromProperty(PROP_PATH, "url");

		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("BrowserValue is Invalid!!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	public void tearDown()
	{
		driver.quit();
	}
}
