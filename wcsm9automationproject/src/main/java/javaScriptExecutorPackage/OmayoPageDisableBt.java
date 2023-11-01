package javaScriptExecutorPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OmayoPageDisableBt {
	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://omayo.blogspot.com/");
	
	WebElement disableTextBox = driver.findElement(By.id("tb2"));
	Point loc = disableTextBox.getLocation();
	int xaxix=loc.getX();
	int yaxix=loc.getY();
	
	//Scroll down till disable button
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	jse.executeScript(("window.scrollBy("+xaxix+",(yaxix-40)+"));
	jse.executeScript("document.getElementById('tb2').value='abced'");
	//take screen shots
	Thread.sleep(2000);

	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/Omayo.png");
	Files.copy(src, dest);


	}

}
