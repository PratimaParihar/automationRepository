package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123456");
		
		WebElement LoginButtonElement = driver.findElement(By.xpath("//button[contains(@class,'_acan')]"));
		
		//verify login button is disable or enable
		boolean status = LoginButtonElement.isEnabled();
		System.out.println(status);
		
		//click on button by using click
		LoginButtonElement.click();
		//
		boolean status1 = LoginButtonElement.isEnabled();
		System.out.println(status1);
		
	}

}
