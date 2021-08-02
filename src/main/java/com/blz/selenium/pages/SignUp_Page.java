package com.blz.selenium.pages;

import com.blz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignUp_Page extends BaseClass {

    @FindBy(linkText = "Sign in")
    WebElement Sign_btn;

    @FindBy(xpath = " //a[normalize-space()='Register']")
    WebElement register_Btn;

    @FindBy(xpath = " //input[@id='input-email-address']")
    WebElement user_Email;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement user_Pwd;

    @FindBy(xpath = "//select[@id='situation-dropdown']")
    WebElement select_Dropdown;

    @FindBy(xpath = "//option[@value='curious_having_a_look']")
    WebElement selector;

    @FindBy(xpath = "//label[normalize-space()='No, thanks']")
    WebElement no_Thanks;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    WebElement Register;


    public SignUp_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void signupTo_App() throws InterruptedException {
        Sign_btn.click();
        Thread.sleep(3000);
        register_Btn.click();
        user_Email.sendKeys("latikakhairnar10@gmail.com");
        user_Pwd.sendKeys("latika@123");
        select_Dropdown.click();
        selector.click();
        no_Thanks.click();
        Register.click();

    }
}
