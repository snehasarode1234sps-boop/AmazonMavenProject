package MKT.Maven_AmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Homepage {
	 WebDriver driver;
	 
	 @FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
     WebElement accountandlist;
//	 @FindBy(xpath="//a[text()=\"Start here.\"]")
//     WebElement newuser;
	 
	 @FindBy(xpath="//span[@class=\"nav-action-inner\"]")
     WebElement signin;
//	 @FindBy(xpath="//span[text()='Sign Out']")
 //    WebElement signout;
	 
	 @FindBy(id="twotabsearchtextbox")
     WebElement search;
	 public void hoveroveraccountandlist(WebDriver driver)
	    {
	    	Actions a1=new Actions(driver);
	    	a1.moveToElement(accountandlist).perform();
	    }
/*	 public void newuser(WebDriver driver)
	    {
		 newuser.click();
	    }*/
	 public void signinbtn(WebDriver driver)
	    {
		 signin.click();
	    }
	/* public void signout(WebDriver driver)
	    {
		 signout.click();
	    }*/
	 public void searchprod(WebDriver driver)
	    {
		 search.sendKeys("shoes"+Keys.ENTER);
	    }
	    public Amazon_Homepage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
}
