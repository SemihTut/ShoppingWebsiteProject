package com.AlphaSense.tests;

import com.AlphaSense.pages.AccountCreationPage;
import com.AlphaSense.pages.BasePage;
import com.AlphaSense.pages.LoginPage;
import com.AlphaSense.utilities.BrowserUtils;
import com.AlphaSense.utilities.ConfigurationReader;
import com.AlphaSense.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;


public class TestCase1{

    LoginPage loginPage=new LoginPage();
    AccountCreationPage creationPage = new AccountCreationPage();

    @Test
    public void test1(){
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitForVisibility(loginPage.basePageSignIn,10);
        loginPage.basePageSignIn.click();
        BrowserUtils.waitForVisibility(creationPage.h1,5);
        Assert.assertEquals(creationPage.h1.getText(),"AUTHENTICATION");
    }

    @Test
    public void test2(){
        Driver.get().get(ConfigurationReader.get("loginUrl"));
        Driver.get().manage().window().maximize();
        Driver.get().quit();
    }

    @Test
    public void createAccounts(){
        Driver.get().get(ConfigurationReader.get("loginUrl"));
        Driver.get().manage().window().maximize();
        BrowserUtils.waitForVisibility(loginPage.createAccountBtn,10);
        loginPage.createAccountEmail.sendKeys("mnbvcx6@hotmail.com");
        loginPage.createAccountBtn.click();
        BrowserUtils.waitForVisibility(creationPage.address1,5);
        creationPage.createNewAccount("Ahmet","Toprak","seni_seviyorum","Helsinki","Virginia",
                "02630","United States","+3584567865","Vantaa");

        BrowserUtils.waitFor(5);

    }
}
