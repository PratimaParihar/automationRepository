package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
		public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.instagram.com/");
		//identify username 
		driver.findElement(By.name("username")).sendKeys("admin");
		//identift password
		driver.findElement(By.name("password")).sendKeys("manager");
		//login button
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		}
}
