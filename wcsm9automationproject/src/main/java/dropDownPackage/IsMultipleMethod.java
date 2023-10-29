package dropDownPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	//single select 
	WebElement dropDown1 = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
	Select sel1 = new Select(dropDown1);
	boolean status1 = sel1.isMultiple();
	System.out.println(status1);
	
	//multiselect dropdown
	
	driver.findElement(By.partialLinkText("Multi")).click();
	WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
	Select sel2 = new Select(dropDown2);
	boolean status2 = sel2.isMultiple();
	System.out.println(status2);

	}

}
