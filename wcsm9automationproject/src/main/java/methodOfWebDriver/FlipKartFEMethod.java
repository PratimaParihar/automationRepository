package methodOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartFEMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.flipkart.com/");
	
	//handle pop up 
	
	driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();		
	
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Laptop");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@title, 'Search')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();)
	driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("text()='Processor')]")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Processor')]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).click();
	
	Thread.sleep(2000);
	//identify all the suggestion of Laptop
	List<WebElement> allLaptops=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	//read all the suggestions of Laptops
	for(int i=0;i<allLaptops.size();i++)
	{
		String Laptops = allLaptops.get(i).getText();
		Thread.sleep(2000);
		for(int j=i;j<=i;j++)
		{
			String price =allPrice.get(j).getText();
			Thread.sleep(2000);
			System.out.println(Laptops+" : "+price);		
		}
		}
	}	
}
