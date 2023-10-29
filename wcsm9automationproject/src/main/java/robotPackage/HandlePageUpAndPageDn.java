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

public class HandlePageUpAndPageDn {
	
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/");
	
	//identify news webelement
	WebElement news =driver.findElement(By.xpath("//h2[text()='Getting Started']"));

	//WebElement news =driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
	//perform right click on 
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.contextClick(news).perform();
	//press page down  go till  to insepect
	Robot robot = new Robot();
	for(int i=0;i<10;i++)
	{
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	//hit enter button
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}

}
