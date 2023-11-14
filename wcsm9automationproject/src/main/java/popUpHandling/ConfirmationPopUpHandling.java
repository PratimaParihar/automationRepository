package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		//generate confirmation pop up
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		//handle confirmation
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();

		//get text of confirm 
		String textOfConfirm = alert.getText();
		System.out.println(textOfConfirm);
		//aacept the confirm
		//alert.accept();
		
		
	}
}
