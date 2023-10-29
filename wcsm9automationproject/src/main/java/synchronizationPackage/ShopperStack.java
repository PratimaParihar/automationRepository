package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStack {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		driver.findElement(By.id("//input[@id='Check Delivery']")).sendKeys("432102");	
		WebElement checkButton=driver.findElement(By.id("Check"));
		explictWait(driver, 60, checkButton).click();
	}	
	public static WebElement explictWait(WebDriver driver, long sec, WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
	}
}
