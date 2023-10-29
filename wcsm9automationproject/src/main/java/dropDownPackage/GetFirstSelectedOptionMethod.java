package dropDownPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Prime/Desktop/wcsm9Webelement/SingleSelectDropdown.html");
	
	//single select dropDown
	WebElement dropDown1 = driver.findElement(By.id("id1"));
	
	//handle the dropDown
	Select sel1 = new Select(dropDown1);
	//select the option from dropDown
	Thread.sleep(2000);
	sel1.selectByValue("v7");
	Thread.sleep(2000);
	//get option from dropDown
	WebElement fristOpt = sel1.getFirstSelectedOption();
	//get text option which is selected first 
	System.out.println(fristOpt.getText());
	//multi select dropDown
	driver.navigate().to("file:///C:/Users/Prime/Desktop/wcsm9Webelement/MultiSelectDropDown.html");
	//identify dropDown
	WebElement dropDown2 = driver.findElement(By.id("id1"));
	Select sel2 = new Select(dropDown2);
	//get 
	for(int i=5;i<8;i++)
	{
		sel2.selectByIndex(i);
	}	
		System.out.println(sel2.getFirstSelectedOption().getText());
	}

}
