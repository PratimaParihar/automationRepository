package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
				public static void main(String[] args) {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://pratima-3010/login.do");
				//identify username text box
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");

				driver.findElement(By.id("loginButton")).click();
				//
				
				WebElement logoutLinkElement = driver.findElement(By.partialLinkText("Logout"));
				
				//
					boolean status = logoutLinkElement.isDisplayed();
					System.out.println(status);	
	}
}
