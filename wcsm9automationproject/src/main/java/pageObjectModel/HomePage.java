package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//store module of homepage
	@FindBy(xpath = "//div[text()='Time-Track']/following-sibling::div/img")private WebElement Time_Track_Module;
	@FindBy(xpath = "//div[text()='Tasks']/following-sibling::div/img")private WebElement Task_Module;
	@FindBy(xpath = "//div[text()='Reports']/following-sibling::div/img")private WebElement Reports_Module;
	@FindBy(xpath = "//div[text()='Users']/following-sibling::div/img")private WebElement Users_Module;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::div/img")private WebElement Work_Schedule_Module;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling::div/img")private WebElement Settings_Module;
	@FindBy(partialLinkText = "Logout") private WebElement Logout_Link;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getTime_Tract_Module()
	{
		return Time_Track_Module;	
	}
	public WebElement getTask_Module()
	{
		return Task_Module;		
	}
	public WebElement getReports_Module()
	{
		return Reports_Module;
	}
	public WebElement getUsers_Module()
	{
		return Users_Module;
	}
	public WebElement getWork_Schedule_Module()
	{
		return Work_Schedule_Module;
	}
	public WebElement getSettings()
	{
		return Settings_Module;
		
	}
	public WebElement getLogout_Link()
	{
		return Logout_Link;
		
	}
	//operational methods
	
}
