package MKT.Maven_AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_profilepage  {
	WebDriver driver;
	 
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
    WebElement accountandlist;
	
	@FindBy(xpath="//span[text()=\"Your Account\"]")
	WebElement myaccount;
	
	@FindBy(xpath="//div[@data-card-identifier=\"SignInAndSecurity\"]")
	WebElement edit;
	
    @FindBy(xpath="//a[text()=\"Edit\"]")
	WebElement edittab;
    
    @FindBy(name="customerName")
	WebElement name;
    
    @FindBy(xpath="//input[@class=\"a-button-input\"]")
	WebElement savebtn;
    
    
	public void hoveroveraccountandlist(WebDriver driver)
    {
    	Actions a1=new Actions(driver);
    	a1.moveToElement(accountandlist).perform();
    }
	public void profile(WebDriver driver)
	{
		myaccount.click();
	}
	public void Editinfo(WebDriver driver)
	{
		edit.click();
	}
	
	public void Editbtn(WebDriver driver)
	{
		edittab.click();
	}
	public void customername(WebDriver driver)
	{
		name.sendKeys("Test");
	}
	public void savechanges(WebDriver driver)
	{
		savebtn.click();
	}
	
	 public Amazon_profilepage (WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
}
