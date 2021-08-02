package com.blz.selenium.test;

import com.blz.selenium.base.BaseClass;
import com.blz.selenium.pages.HomePage;
import com.blz.selenium.pages.LoginPage;
import com.blz.selenium.pages.SignUp_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Zoopla_Test extends BaseClass {

    @Test
    public void signUp_Zoopla() throws InterruptedException {
        SignUp_Page signup = new SignUp_Page(driver);
        signup.signupTo_App();
    }
    @Test
    public void login_Zoopla() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.signInTo_App();
        String actual= driver.getCurrentUrl();
        System.out.println(actual);
        String expected="https://www.zoopla.co.uk/myaccount/";
        Assert.assertEquals(actual ,expected );
    }

    @Test
    public void homePage_SearchText() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.signInTo_App();
        HomePage home = new HomePage(driver);
        home.search_text();
        String actual_title=home.search_text();
        System.out.println(actual_title );
        String expected_title="Property to Rent in London - Renting in London - Zoopla";
        Assert.assertEquals(actual_title,expected_title );
    }

    @Test
    public void homePage_properties_list() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.signInTo_App();
        HomePage home = new HomePage(driver);
        home.properties_list();
        String actual_Url= home.properties_list ();
        System.out.println(actual_Url );
        String expected_Url="Dexters - Richmond, TW9 - Property to rent from Dexters - Richmond estate agents, TW9 - Zoopla";
        Assert.assertEquals(actual_Url,expected_Url );

    }
}
