package dropDownPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	//identify phone no dropdown
	WebElement dropDown1 = driver.findElement(By.xpath("//select[contains(@class,'border-0 px-3 py-3 ')]"));
	
	Select sel1 = new Select(dropDown1);
	//Thread.sleep(2000);
	sel1.selectByIndex(2);
	
	Thread.sleep(2000);
	//identify country dropdown
	WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	
	Select sel2 = new Select(dropDown2);
	Thread.sleep(2000);
	sel2.selectByValue("India");
	
	//identify drop down
	//navigate().to("file:///C:/Users/Prime/Desktop/wcsm9Webelement/MultiSelectDropDown.html");
	WebElement dropDown4 = driver.findElement(By.id("id1"));
	Select sel4 = new Select(dropDown4);
	Thread.sleep(2000);
	for(int i=0;i<5;i++)
	{
		sel4.selectByIndex(i);
	}
	
}
}	
