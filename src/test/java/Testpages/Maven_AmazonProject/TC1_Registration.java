package Testpages.Maven_AmazonProject;

import org.testng.annotations.Test;
import Amazon_Utility.Amazon_BaseClass;
import MKT.Maven_AmazonProject.Amazon_Homepage;
import MKT.Maven_AmazonProject.Amazon_Loginpage;

public class TC1_Registration extends Amazon_BaseClass  
{
   @Test
   public void register() 
   {
	   Amazon_Homepage homepage=new Amazon_Homepage(driver);
	   homepage.hoveroveraccountandlist(driver);
	//   homepage.newuser(driver);
	   
	   
	   
	   Amazon_Loginpage loginpage=new Amazon_Loginpage(driver);
	 /*  loginpage.emailadd(driver);
	   loginpage.continuebtn(driver);
	   loginpage.createacc(driver);
	   loginpage.mobileno(driver);
	   loginpage.name(driver);
	   loginpage.password(driver);
	   loginpage.verifybtn(driver);*/
	   
	   Amazon_Homepage homepage1=new Amazon_Homepage(driver);
	   homepage1.hoveroveraccountandlist(driver);
//	   homepage1.signout(driver);
	   
	   
   }
}
