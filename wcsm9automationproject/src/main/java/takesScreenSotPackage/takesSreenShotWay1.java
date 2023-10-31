package takesScreenSotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takesSreenShotWay1 {
		public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		//take screen shot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Sceenshots.demoappss.jpg");
		Files.copy(src, dest);
		
		}

}
