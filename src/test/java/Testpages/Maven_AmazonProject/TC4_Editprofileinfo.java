package Testpages.Maven_AmazonProject;

import org.testng.annotations.Test;

import Amazon_Utility.Amazon_BaseClass;
import MKT.Maven_AmazonProject.Amazon_Loginpage;
import MKT.Maven_AmazonProject.Amazon_profilepage;

public class TC4_Editprofileinfo extends Amazon_BaseClass{
   @Test
	public void profile() throws InterruptedException
	{
	   Amazon_profilepage profile=new Amazon_profilepage(driver);
	   profile.hoveroveraccountandlist(driver);
	   profile.profile(driver);
	   profile.Editinfo(driver);
	   Amazon_Loginpage loginpage=new Amazon_Loginpage(driver);
	   loginpage.emailadd(driver);
	   loginpage.continuebtn(driver);
	   Thread.sleep(10);
	   loginpage.password(driver);
	   loginpage.signin(driver);
	   profile.Editbtn(driver);
	   profile.customername(driver);
	   profile.savechanges(driver);
	}
}
