package com.Skynets.ui;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestPageObject2 {
	@Test
	public void testCreateUser()
	{
		System.setProperty("Webdriver.chrome.driver","F:/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		CreateNewUser user=new CreateNewUser(driver);
	user.getUserNameTextBox().sendKeys("admin");
	user.getPassWordTextBox().sendKeys("manager");
	user.getRetypePasswordTextBox().sendKeys("manager");
	user.getFirstNameTextBox().sendKeys("rupam");
	user.getlastNameTextBox().sendKeys("jha");
	user.getEmailAddressTextBox().sendKeys("shilarupam33@gmail.com");
	user.getCreateUserButton().click();
	}
	

}
