package dropDownPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Prime/Desktop/wcsm9Webelement/SingleSelectDropdown.html");
	
	//single select dropDown
	WebElement dropDown1 = driver.findElement(By.id("id1"));
	
	//handle the dropDown
	Select sel1 = new Select(dropDown1);
	WebElement allOps = sel1.getWrappedElement();
	System.out.println(allOps.getText());
	//get option
	List<WebElement> options = sel1.getOptions();
	
	//select the options from drop Dwon without using selection method
	for(WebElement op:options)
	{
		if(op.getText().equals("Vada Pav"))
		{	
			op.click();
		}
		Thread.sleep(2000);
		System.out.println(op.getText());
	}

	}
}
