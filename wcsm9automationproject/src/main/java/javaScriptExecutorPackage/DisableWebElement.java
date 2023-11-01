package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableWebElement {
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		//explicit type cast into javascript executor
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		//handle disable name text box
		jse.executeScript("(document.getElementById('name').value='pratima')");
		Thread.sleep(2000);
		//handle disable email text box
		jse.executeScript("(document.getElementById('email').value='pratimaparihar.139@gmail.com')");
		Thread.sleep(2000);
		//handle disable password text box
		jse.executeScript("(document.getElementById('password').value='pratima@123')");
		
		
		//click on registor button
		WebElement disableRegistorButton = driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(2000);
	
		if(disableRegistorButton.isDisplayed())
		{
			jse.executeScript("arguments[0]",disableRegistorButton);
			jse.executeScript("arguments[0].click()", driver.findElement(By.xpath("//a[contains(@class,'bg-orange-500')]")));
			System.out.println("Click");

		}
		else
		{
			System.out.println("not Click");
		}
		
		}

	}
