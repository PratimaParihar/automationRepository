package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleCopyText {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.id("denyBtn")).click();
	
	// to perform mouse hover
	WebElement watchJwelleryTarget = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	Actions act = new Actions(driver);
	act.click(watchJwelleryTarget).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Band']")).click();

	//double click AND HOLD
	WebElement click1 = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));

	for(int i=1;i<=2;i++)
	{
		act.doubleClick(click1).perform();
		Thread.sleep(2000);
		act.clickAndHold(click1).perform();
	}
	//copy the filter by text
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		//identify search by text
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		
		//paste filtered by text
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		//click on search icon
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
	
	}
	}
