package com.Skynets.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getTimeTrackTab()
	{
		return driver.findElement(By.xpath("//div[contains(text(),'TimeTrack"));
	}
	public WebElement getTasksTab()
	{
		return driver.findElement(By.xpath("//div[text()='Tasks']"));
	}
	public WebElement getUsersTab()
	{
		return driver.findElement(By.xpath("//div[text()='Tasks']"));
	}
	
	public WebElement getSettingTab()
	{
		return driver.findElement(By.xpath("//div[text()='setting']"));
	}
	public WebElement getLogoutLink()
	{
		return driver.findElement(By.id("logoutLink"));
	}
}
