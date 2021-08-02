package com.blz.selenium.pages;

import com.blz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/header/div/div/div[1]/div[2]/ul/li[5]/a")
    WebElement Sign_btn;

    @FindBy(xpath = "//input[@id='input-email-address']")
    WebElement user_Email;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement user_Pwd;

    @FindBy(xpath = "//button[normalize-space()='Sign in']")
    WebElement clickOn_SignIn;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void  signInTo_App() throws InterruptedException {
        Sign_btn.click();
        Thread.sleep(1000);
        user_Email.sendKeys("latikakhairnar10@gmail.com");
        Thread.sleep(500);
        user_Pwd.sendKeys("latika@123");
        clickOn_SignIn.click();
        Thread.sleep(3000);
       // return driver.getTitle();
    }
}
