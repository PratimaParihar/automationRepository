package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfGoogleMap {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
	
	Thread.sleep(2000);
	//before click map swith control to frame
	//driver.switchTo().frame(0);
	WebElement frameelement = driver.findElement(By.name("app"));
	
	//driver.switchTo().frame("apps");
	driver.switchTo().frame(frameelement);
	
	Thread.sleep(2000);

	driver.findElement(By.xpath("//span[text()='Maps']")).click();
	
	}

}
