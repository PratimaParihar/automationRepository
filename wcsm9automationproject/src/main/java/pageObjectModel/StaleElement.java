package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://pratima-3010/login.do");
		WebElement usnTB = driver.findElement(By.name("usename"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		usnTB.sendKeys("admin");
		driver.findElement(By.name("pwd"));
		
	}

}
