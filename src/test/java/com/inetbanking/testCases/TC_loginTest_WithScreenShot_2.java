package com.inetbanking.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
public class TC_loginTest_WithScreenShot_2 extends BaseClass4
{
	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseURL);
		Logger.info("URL is opened");
	    LoginPage lp= new  LoginPage(driver);
        lp.setUserName(username);
        Logger.info("Entered username");
	    lp.setPassword(password);
	    Logger.info("Entered password");
	    lp.clickSubmit();
	    String shnthveer = driver.getTitle();
	    System.out.println(shnthveer);
	    if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	    {
	    	captureScreen(driver,"loginTest");
	    	Assert.assertTrue(true);
	    	Logger.info("Login test Passed");
	    }
	    else
	    {
	    	captureScreen(driver,"loginTest");
	    	Assert.assertTrue(false);
	    	Logger.info("Login Test Failed");
	    	
	    }
	
	
	}
}