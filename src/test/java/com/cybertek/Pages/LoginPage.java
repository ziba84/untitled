package com.cybertek.Pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "inputEmail")
    public WebElement librarianUserName;

    @FindBy(id = "inputPassword")
    public WebElement librarianPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

   @FindBy(id ="user_count")
    public WebElement userCount;



}
