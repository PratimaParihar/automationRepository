package methodOfWebElement;

import java.awt.Checkbox;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://pratima-3010/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");

		
		WebElement CheckboxElement = driver.findElement(By.id("//input[@id='keepLoggedInCheckBox']"));
		// check = Checkbox.IsSelectedMethod();
		boolean status = CheckboxElement.isSelected();
		System.out.println(status);
		
		//
		CheckboxElement.click();
		//boolean status1 = CheckboxElement.isSelected();
		//System.out.println(status1);
		
		
	}
}
