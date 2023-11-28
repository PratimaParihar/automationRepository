package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//stores web element of login page
	
	@FindBy (name="username") private WebElement usnTB;
	@FindBy (name="pwd") private WebElement passTB;
	@FindBy (id="loginButton") private WebElement loginButton;
	@FindBy (name="remember") private WebElement checkBox;
	@FindBy (partialLinkText ="Actimind") private WebElement actiMind1ink;
	@FindBy (partialLinkText = "License") private WebElement licenselink;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getActiMind1ink() {
		return actiMind1ink;
	}

	public WebElement getLicenselink() {
		return licenselink;
	}
	//operational methods
	
	public void validLogin(String validusn,String validpass)
	{
		usnTB.sendKeys(validusn);
		passTB.sendKeys(validpass);
		loginButton.click();
	}
	public void invalidLogin(String invalidusn,String invalidpass)
	{
		usnTB.sendKeys(invalidusn);
		passTB.sendKeys(invalidpass);
		loginButton.click();
	}
}
