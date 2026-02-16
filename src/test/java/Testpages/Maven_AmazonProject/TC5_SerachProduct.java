package Testpages.Maven_AmazonProject;

import org.testng.annotations.Test;

import Amazon_Utility.Amazon_BaseClass;
import MKT.Maven_AmazonProject.Amazon_Homepage;
import MKT.Maven_AmazonProject.Amazon_Loginpage;

public class TC5_SerachProduct extends Amazon_BaseClass{
	@Test
	public void searching() throws InterruptedException
	{
		Amazon_Homepage home=new Amazon_Homepage(driver);
		home.hoveroveraccountandlist(driver);
		home.signinbtn(driver);
		Amazon_Loginpage login=new Amazon_Loginpage(driver);
		login.emailadd(driver);
		login.continuebtn(driver);
		login.password(driver);
		login.signin(driver);
		Thread.sleep(10);
	    home.searchprod(driver);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	}

