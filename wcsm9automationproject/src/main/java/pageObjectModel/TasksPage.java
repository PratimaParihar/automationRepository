package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TasksPage {
	//store all the web-element of task page
	
	@FindBy(partialLinkText = "Projects & Customers")private WebElement Project_Customer_Sub_module;
	
	@FindBy(xpath = "//input[@value='Create New Customer']")private WebElement Create_new_customer_Button;
	
	@FindBy(xpath = "//input[@value='Create New Project']")private WebElement Create_new_project_Button;
	
	@FindBy(name = "name")
	private WebElement customer_nameTB;
	@FindBy(name = "createCustomerSubmit")
	private WebElement createCustomer_Button;
	
	@FindBy(name = "customerId")
	private WebElement customer_name_Dropdown;
	@FindBy(name = "name")
	private WebElement project_nameTB;
	@FindBy(name = "createProjectSubmit")
	private WebElement createProject_Button;
	
	//initialization
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	//utilization
	public WebElement getProject_Customers_Sub_Module() 
	{
		return Project_Customer_Sub_module;
		
	}
	public WebElement getCreate_new_customer_Button()
	{
		return Create_new_customer_Button;
	}
	public WebElement getCreate_new_project_Button()
	{
		return Create_new_project_Button;
	}
	
	public WebElement getCustomer_nameTB()
	{
		return customer_nameTB;
	}
	public WebElement getCreateCustomer_Button()
	{
		return createCustomer_Button;
	}
	public WebElement getCustomer_name_Dropdown()
	{
		return customer_name_Dropdown;
	}
	public WebElement getProject_nameTB()
	{
		return project_nameTB;
	}
	//operational method
	public void createcustomer_createproject_method(String cust_name,String proj_name) throws InterruptedException
	{
		Project_Customer_Sub_module.click();
		Thread.sleep(2000);
		Create_new_customer_Button.click();
		Thread.sleep(2000);
		customer_nameTB.sendKeys(cust_name);
		Thread.sleep(2000);
		createCustomer_Button.click();
		Thread.sleep(2000);
		Create_new_project_Button.click();
		Select sel = new Select(customer_name_Dropdown);
		sel.selectByVisibleText(cust_name);
		Thread.sleep(2000);
		project_nameTB.sendKeys(proj_name);
		createProject_Button.click();
	}
}
