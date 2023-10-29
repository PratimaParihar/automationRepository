package assignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraEndToEndFlow {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	
	driver.get("https://www.myntra.com/");
	//search text-field
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
	//search icon
	
	driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	
	//get window handle
	Thread.sleep(2000);
	String parentHandle= driver.getWindowHandle();
	//click on product
	driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[1]")).click();
	
	//get the address of all the window
			Thread.sleep(2000);
			Set<String> allHandles=driver.getWindowHandles();
			
			for(String wh:allHandles)
			{
				if(!parentHandle.equals(wh))
				{
					driver.switchTo().window(wh);
				}
			}	
			Thread.sleep(2000);
			

	//click on size of shoes
			//Thread.sleep(2000);
	//driver.findElement(By.xpath("(//button[contains(@class,'size-buttons')])[1]")).click();
	driver.findElement(By.xpath("(//button[contains(@class,'size')])[1]")).click();
	Thread.sleep(2000);
	//click	on radio button
	driver.findElement(By.xpath("(//label[@class='common-customRadio common-newCustomRadio'])[1]")).click();
	Thread.sleep(2000);
	
	//click on add to Bag
	driver.findElement(By.xpath("(//div[contains(@class,'pdp-add-to')])[1]")).click();
	Thread.sleep(2000);
	//click on Bag icon
	driver.findElement(By.xpath("//span[contains(text(),'Bag')]")).click();
	driver.quit();
	
	}

}
