package com.blz.selenium.pages;

import com.blz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//a[normalize-space()='To rent']")
    WebElement clickOn_ToRent;

    @FindBy(xpath = "//input[@id='search-input-location']")
    WebElement input_text;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement search_btn;

    @FindBy(xpath = "//a[@data-testid = 'listing-details-link']")
    List<WebElement> list_of_properties;


    @FindBy(xpath = "//a[normalize-space()='View agent properties']")
    WebElement view_agent;



    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String search_text() throws InterruptedException {
        clickOn_ToRent.click();
        Thread.sleep(3000);
        input_text.sendKeys("LONDON");
        Thread.sleep(1000);
        search_btn.click();
        Thread.sleep(2000);
        return driver.getTitle();
    }
    public String properties_list() throws InterruptedException {
        clickOn_ToRent.click();
        Thread.sleep(3000);
        input_text.sendKeys("LONDON");
        Thread.sleep(1000);
        search_btn.click();
        Thread.sleep(2000);
        System.out.println(list_of_properties.size());
        Thread.sleep(2000);
        //iterate over the list using for-each loop
        for (WebElement webElement : list_of_properties) {
            String properties_name = webElement.getText();//fetch the text
            Thread.sleep(2000);
            System.out.println(properties_name);
        }
        Thread.sleep(2000);
        list_of_properties.get(4).click();
        Thread.sleep(3000);
        view_agent .click();
        Thread.sleep(3000);
        return driver.getTitle();

    }
}


