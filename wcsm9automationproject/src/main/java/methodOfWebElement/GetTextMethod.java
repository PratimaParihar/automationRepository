package methodOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
				public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("laptops");
			Thread.sleep(2000);
		//WebElement allLaptop = driver.findElement(By.xpath("//div[@class='sbic sb43']"));
			List<WebElement> allLaptops = driver.findElements(By.xpath("/div[@class='sbic sb43']"));
			//read all the suggestions of Laptops
			//Thread.sleep(2000);
			for(int i=0;i<allLaptops.size();i++)
			{
				String Laptops = allLaptops.get(i).getText();
				Thread.sleep(2000);
				System.out.println(Laptops+ " " +allLaptops);
			
			}
			
			
	}
}
