package com.Skynets.ui;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
public WebElement getUserNameTextBox()
{
	WebElement ele=driver.findElement(By.name("username"));
	return ele;
}
public WebElement getPassWordTextBox()
{
	return driver.findElement(By.name("pwd"));
}
public WebElement getLoginButton()
{
	return driver.findElement(By.id("loginButton"));
}
public WebElement getHeaderElement() {
	// TODO Auto-generated method stub
	return null;
}
}



