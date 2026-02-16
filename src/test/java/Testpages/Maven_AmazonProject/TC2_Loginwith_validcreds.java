package Testpages.Maven_AmazonProject;

import org.testng.annotations.Test;

import Amazon_Utility.Amazon_BaseClass;
import MKT.Maven_AmazonProject.Amazon_Homepage;
import MKT.Maven_AmazonProject.Amazon_Loginpage;

public class TC2_Loginwith_validcreds extends Amazon_BaseClass {
	 @Test
	   public void register() throws InterruptedException 
	   {
		   Amazon_Homepage homepage=new Amazon_Homepage(driver);
		   homepage.hoveroveraccountandlist(driver);
		   homepage.signinbtn(driver);
		   
		   Amazon_Loginpage loginpage=new Amazon_Loginpage(driver);
		   loginpage.emailadd(driver);
		   loginpage.continuebtn(driver);
		   Thread.sleep(10);
		   loginpage.password(driver);
		   loginpage.signin(driver);
	
	//	   homepage.signout(driver);
}
}