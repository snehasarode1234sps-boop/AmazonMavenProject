package MKT.Maven_AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Loginpage {
	WebDriver Driver;
	
	@FindBy(name="email")
    WebElement email;
	@FindBy(xpath="//input[@class=\"a-button-input\"]")
    WebElement btn;
/*	@FindBy(xpath="//input[@class=\"a-button-input\"]")
    WebElement createaccbtn;
	@FindBy(id="ap_phone_number")
    WebElement number;
	@FindBy(name="customerName")
    WebElement firstname;
	
	@FindBy(id="continue")
    WebElement verifyno;*/
	@FindBy(name="password")
    WebElement PW;
	@FindBy(id="signInSubmit")
    WebElement signinbtn;
    public void emailadd(WebDriver driver)
    {
    	email.sendKeys("9209406339");
    }
    public void continuebtn(WebDriver driver)
    {
    	btn.click();
    }
 /*   public void createacc(WebDriver driver)
    {
    	createaccbtn.click();
    }
    public void mobileno(WebDriver driver)
    {
    	number.sendKeys("9423187841");
    }
    public void name(WebDriver driver)
    {
    	firstname.sendKeys("Jiya");
    }*/
    public void password(WebDriver driver)
    {
    	PW.sendKeys("Jiya@123");
    }
 /*   public void number(WebDriver driver)
    {
    	verifyno.sendKeys("9423187841");
    }*/
 /*   public void verifybtn(WebDriver driver)
    {
    	verifyno.click();
    }*/
    public void signin(WebDriver driver)
    {
    	signinbtn.click();
    }
    public Amazon_Loginpage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
}
