package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demoapps.qspiders.com/");
			driver.findElement(By.xpath("//section[text()='Button']")).click();
			driver.findElement(By.partialLinkText("Right Click")).click();
			
			WebElement rightclick1 = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
			//Thread.sleep(2000);
			WebElement rightclick2 = driver.findElement(By.xpath("(//button[text()='Right Click'])[2])]"));
			WebElement rightclick3 = driver.findElement(By.xpath("(//button[text()='Right Click'])[3]"));			
			Actions act = new Actions(driver);
			act.contextClick(rightclick1).perform();
			Thread.sleep(2000);
			act.contextClick(rightclick2).perform();
			Thread.sleep(2000);
			act.contextClick(rightclick3).perform();
	}

}
