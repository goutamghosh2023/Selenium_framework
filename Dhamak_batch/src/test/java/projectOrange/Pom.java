package projectOrange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {

	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@href='/web/index.php/pim/viewPimModule']")
	private WebElement PimModule;
	
	@FindBy(xpath="//a[.='Add Employee']")
	private WebElement Addemployee;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement Lastemployee;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit;
	
	@FindBy(xpath="//div[@id='oxd-toaster_1']/div[1]/div[1]/div[2]/p[1]")
	private WebElement alert;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement username()
	{
		return username;
	}
	public WebElement pass()
	{
		return pass;
	}
	public WebElement submit()
	{
		return submit;
	}
	public WebElement PimModule() 
	{
		return PimModule;
	}
	public WebElement Addemployee()
	{
		return Addemployee;
	}
	public WebElement Firstname()
	{
		return Firstname;
	}
	public WebElement Lastemployee()
	{
		return Lastemployee;
	}
	public WebElement Submit()
	{
		return Submit;
	}
	public WebElement alert()
	{
		return alert;
	}
}
