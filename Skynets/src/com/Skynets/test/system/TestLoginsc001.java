package com.Skynets.test.system;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Skynets.config.DriverFactory;
import com.Skynets.ui.HomePage;
import com.Skynets.ui.LoginPage;
import com.Skynets.utils.GetData;

public class TestLoginsc001 {
	WebDriver driver=DriverFactory.getDriverInstance();
	LoginPage login=new LoginPage(driver);
	HomePage home=new HomePage(driver);
	String un=GetData.FromExcel("tdata","sc001",1,0);
	String pwd=GetData.FromExcel("tdata","sc001",1,1);
	@Test
	public void testLoginTc001()
	{
		login.getUserNameTextBox().sendKeys(un);
		login.getPassWordTextBox().sendKeys(pwd);
		login.getLoginButton().click();
		boolean actual=home.getLogoutLink().isDisplayed();
		boolean expected=true;
	Assert.assertEquals(actual, expected);
		home.getLogoutLink().click();
		String actualText=login.getHeaderElement().getText();
		String expectedText="please identify yourself";
		Assert.assertEquals(actual, expected);
	}
	@AfterMethod
	public void PostCondition()
	{
		driver.close();
	}
}
	
