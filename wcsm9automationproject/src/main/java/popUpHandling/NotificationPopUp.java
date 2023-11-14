package popUpHandling;

import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {
	static WebDriver driver;
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter browserValue");
			String browserValue = sc.next();
			
			if(browserValue.equalsIgnoreCase("Chrome"))
			{
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--disable-Notification");
				
				driver=new ChromeDriver(co);
			}
			else if(browserValue.equalsIgnoreCase("FireFox"))
			{
				FirefoxOptions fo=new FirefoxOptions();
				fo.addArguments("--disable-Notification");
				
				driver=new FirefoxDriver(fo);
			}
			else if(browserValue.equalsIgnoreCase("Edge"))
			{
				EdgeOptions eo=new EdgeOptions();
				eo.addArguments("--disable-Notification");
				
				driver=new EdgeDriver(eo);
			}
			driver.get("");		}
}
