package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://pratima-3010/login.do");
		//perform login operations
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButtons")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		//click on Logo and scheme
		driver.findElement(By.partialLinkText("Logo & Color Scheme")).click();
		
		driver.findElement(By.id("uploadNewLogoOption")).click();
		WebElement fileButton = driver.findElement(By.name("formCustomInterfaceLogo"));
		
		//perform double click i=on fileButton
		
	}

}
