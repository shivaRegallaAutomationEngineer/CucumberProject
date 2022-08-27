package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;



public class LoginPageElements extends Base {
//we are going to use page object model as design pattern
//we are going to have the page object model with page factory
	
	//page object model without using  page factory 
//public WebElement username=driver.findElement(By.id("txtUsername"));
//public WebElement password=driver.findElement(By.id("txtPassword"));
//public WebElement loginButton=driver.findElement(By.id("btnLogin"));


//we are going to have the page object model with page factory
@FindBy(name="username")
public WebElement userName;

@FindBy(name="password")
public WebElement password;

@FindBy(xpath="//button[@type='submit']")
public WebElement loginButton;

@FindBy(id="spanMessage")
public WebElement errorMessage;

public LoginPageElements() {
	PageFactory.initElements(driver,this);
}

}
