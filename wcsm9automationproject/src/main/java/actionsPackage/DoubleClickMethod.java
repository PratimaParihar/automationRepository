package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
			//click on double click
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement yesTarget1 = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		WebElement yesTarget2 = driver.findElement(By.xpath("(//button[text()='Yes'])[2]"));
		WebElement scaleTartget = driver.findElement(By.xpath("//button[text()='5']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(yesTarget1).perform();
		Thread.sleep(2000);
		act.doubleClick(yesTarget2).perform();
		Thread.sleep(2000);
		act.doubleClick(scaleTartget).perform();
	
		
	
	}

}
