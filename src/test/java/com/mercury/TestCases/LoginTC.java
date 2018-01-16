package com.mercury.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.mercury.MasterPage.MasterPage;
import com.mercury.Pages.Login;
import com.mercury.Pages.find_a_flight;



public class LoginTC extends MasterPage{


	public LoginTC() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test() 
	 public void login_mercury() throws IOException
	 {
		 
		Login lg= new Login();
	    lg.login_page();
	    Assert.assertEquals("Google", dr.getTitle());
	   
	 
	 }
	
	@Test()
	public void login_mercury_gs() throws IOException
	{
		find_a_flight ff= new find_a_flight();
		ff.login();
	}
	
	
	@AfterMethod()
	public void tkscreenshot(ITestResult result)throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			captureScreenShot(result.getName());
		}
	}
	
	
	@AfterTest()
	public void teardown()
	{
		close_browser();
	}
}
