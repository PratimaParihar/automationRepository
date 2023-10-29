package methodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
			public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(53));
			driver.get("http://desktop-hbul4k6/login.do");
			WebElement usernameTextBox = driver.findElement(By.name("username"));
			System.out.println(usernameTextBox);
			usernameTextBox.sendKeys("admin");
			WebElement passwordTextBox = driver.findElement(By.name("pwd"));
			System.out.println(passwordTextBox);
			passwordTextBox.sendKeys("manager");	
		}
}
