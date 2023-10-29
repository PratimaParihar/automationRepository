package assignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartEndToEndFlow {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.get("https://www.flipkart.com/");
		//handle pop up 
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		//search text-field
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone");
		//click on search icon
		driver.findElement(By.xpath("//button[contains(@title, 'Search')]")).click();
		
		//get window handle
		Thread.sleep(2000);
		String parentHandle= driver.getWindowHandle();
		//click on product
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();

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
		//click on read color iphone
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_1fGeJ5 PP89tw']")).click();
		// click on add to cart
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}

