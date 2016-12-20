package com.Skynets.ui;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageObject {
@Test
public void TestLogin()
{
System.setProperty("Webdriver.Chrome.driver","F:/Chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/login.do");
LoginPage login=new LoginPage(driver);
login.getUserNameTextBox().sendKeys("admin");
login.getPassWordTextBox().sendKeys("manager");
login.getLoginButton().click();
}
}

