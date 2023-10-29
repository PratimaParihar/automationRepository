package dropDownPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Prime/Desktop/wcsm9Webelement/MultiSelectDropDown.html");
	WebElement menuDropDown = driver.findElement(By.id("id1"));
	Select sel=new Select(menuDropDown);
	//multiselect dropdown
	for(int i=0;i<4;i++)
	{
		Thread.sleep(2000);
		sel.selectByIndex(i);
	}
	
		//read only selected options from menu 
		List<WebElement> allOps = sel.getAllSelectedOptions();
		//read the list by using for loop
		for(int i=0;i<allOps.size();i++)
		{
			String op = allOps.get(i).getText();
			Thread.sleep(2000);
			System.out.println(op);
			
		}
		//read only selected options from menu 
		for(WebElement opt:allOps)
		{
			String op = opt.getText();
			Thread.sleep(2000);
			System.out.println(op);
		}
}
}
