package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Script {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Prime/Desktop/wcsm9Webelement/MultiSelectDropDown.html");
	//to click on dropdown button
	//driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	//to select by index
	WebElement dropDown1 = driver.findElement(By.id("id1"));
	Select sel1 = new Select(dropDown1);
	//Thread.sleep(2000);
	for(int i=0;i<5;i++)
	{
	sel1.selectByIndex(i);
	Thread.sleep(2000);
	sel1.deselectByIndex(i);
	}
}

}
