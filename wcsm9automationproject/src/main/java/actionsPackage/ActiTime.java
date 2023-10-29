package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://pratima-3010/login.do" );
	
	driver.findElement(By.name("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
	driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	driver.findElement(By.id("uploadNewLogoOption")).click();
	driver.findElement(By.name("formCustomInterfaceLogo.logo")).click();

	}

}
