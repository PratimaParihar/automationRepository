package dropDownPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	//identify phone no dropdown
	WebElement dropDown1 = driver.findElement(By.xpath("//select[cointains(@class='border-0')]"));
	
	Select sel1 = new Select(dropDown1);
	//Thread.sleep(2000);
	sel1.selectByIndex(2);

	//deleselect
	Thread.sleep();
	sel.deselectByIndex(2);
	
	
}
}
