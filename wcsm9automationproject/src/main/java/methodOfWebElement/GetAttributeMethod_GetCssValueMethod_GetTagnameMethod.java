package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValueMethod_GetTagnameMethod {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	//get the attribute value of username textBox
	WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	String attributeValue = usnTB.getAttribute("class");
	System.out.println(attributeValue);
	
	//get the css property of username txtbox
	String cssValue = usnTB.getCssValue("width");
	System.out.println(cssValue);
	
	//get the tagname
	String tag = usnTB.getTagName();
	System.out.println(tag);
	
	
	}

}
