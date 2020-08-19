package com.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hubspot.base.BasePage;

public class LoginPage extends BasePage {
    WebDriver driver;
    //locators
    By emailId = By.id("username");
    By password = By.id("password");
    By loginBtn = By.id("loginBtn");
	
   //constructor 
   public LoginPage(WebDriver driver) {
	   this.driver =driver;
   }
   //page Action
   public String getPageTitle(){
	   return driver.getTitle();
	   
   }
   public void doLogin(String username,String pwd){
	  driver.findElement(emailId) .sendKeys(username);
	  driver.findElement(password).sendKeys(pwd);
	  driver.findElement(loginBtn).click();
	  
	  
   }
}
