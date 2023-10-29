package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://pratima-3010/login.do");
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		

		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("pwd")).clear();
	}

}
