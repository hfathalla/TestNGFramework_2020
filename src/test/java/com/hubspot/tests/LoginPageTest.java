package com.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.hubspot.base.BasePage;
import com.hubspot.pages.LoginPage;
import com.hubspot.util.Constants;



public class LoginPageTest {
WebDriver driver;
Properties prop;

BasePage basePage;
LoginPage loginPage;


@BeforeMethod
public void setUp(){
	basePage =new BasePage();
	prop = basePage.initialize_properties();
	driver = basePage.initialize_driver(prop);
	loginPage =new LoginPage(driver);
	
}
@Test(priority =2)
public void loginTest(){
	loginPage.doLogin("hfathalla543@gmail.com", "semo123");
}
@Test(priority =1, enabled =true)
public void getTitle(){
	String title =loginPage.getPageTitle();
	System.out.println(title);
	Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE,"title is in-correct");
	
}
@AfterMethod
public void tearDown(){
	driver.quit();
}

}
