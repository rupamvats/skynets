package com.Skynets.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewUser {
	WebDriver driver;
	public CreateNewUser(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getUserNameTextBox()
	{
	return driver.findElement(By.name("name"));
	}
	public WebElement getPassWordTextBox()
	{
return driver.findElement(By.name("passwordText"));
	}
public WebElement getRetypePasswordTextBox()
{
return driver.findElement(By.name("passwordTextRetype"));
}
public WebElement getFirstNameTextBox()
{
return driver.findElement(By.name("firstName"));
}
public WebElement getlastNameTextBox()
{
return driver.findElement(By.name("lastName"));
}
public WebElement getEmailAddressTextBox()
{
return driver.findElement(By.name("email"));
}
public WebElement getCreateUserButton()
{
return driver.findElement(By.xpath("//input[@type='submit']"));
}
}

