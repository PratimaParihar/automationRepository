package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableButtonDemoApp {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demoapps.qspiders.com/");
			
			driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
			driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
			driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();		}

}
