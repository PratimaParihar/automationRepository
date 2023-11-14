package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfBlueStone {
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		
		//handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		
		WebElement FrameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(FrameElement);
		
		Thread.sleep(2000);

		//click on chat box
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("abced");
		driver.findElement(By.id("chat-fc-email")).sendKeys("abd@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
		

		
		}
}
