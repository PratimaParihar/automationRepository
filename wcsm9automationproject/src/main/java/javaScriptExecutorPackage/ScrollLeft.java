package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft {
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		//Scroll Right
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{	
		jse.executeScript("window.scrollBy(5000,0)");
		//Scroll Left
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(-5000,0)");
		}
		}
}
