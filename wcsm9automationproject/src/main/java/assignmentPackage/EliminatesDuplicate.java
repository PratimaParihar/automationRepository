package assignmentPackage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicate {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("file:///C:/Users/Prime/Desktop/wcsm9Webelement/SingleSelectDropdown.html");
	
	//identify dropdown and store in ref variable single select dropDown
	WebElement menudropDown = driver.findElement(By.id("id1"));
	
	//get all the options of menuDropDownhandle dropDown
	Select sel1 = new Select(menudropDown);
	List<WebElement> allOps = sel1.getOptions();
	
	//to eliminate duplicate we use HashSet
	HashSet<String> hs = new HashSet<String>();
	
	//read the list by using for loop and eliminate the duplicates
	for(int i=0;i<allOps.size();i++)
	{
	WebElement op = allOps.get(i);
	
	//get the text of Webelement
	String dropDownOption=op.getText();
	//add dropDownOption into HashSet and remove duplicate from dropDown 
	hs.add(dropDownOption);
	}
	
	Thread.sleep(2000);
	//read the options from HasHSet by using for each loop
	for(String opt:hs)
	{
		Thread.sleep(2000);
		System.out.println(opt);
	}
}
}
