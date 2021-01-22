package com.AlphaSense.pages;


import com.AlphaSense.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    //Already Registered
    @FindBy(id="email")
    public WebElement userEmail;

    @FindBy(id="passwd")
    public WebElement password;

    @FindBy(id = "SubmitLogin")
    public WebElement sigInBtn;

    //Create An Account

    @FindBy(id = "email_create")
    public WebElement createAccountEmail;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountBtn;

    // check the logged user
    @FindBy(css = "a[title='View my customer account'] span")
    public WebElement loggedUserName;

    public void loginForRegisteredUser(String emailAdress, String passwrd) {

        userEmail.sendKeys(emailAdress);
        password.sendKeys(passwrd, Keys.ENTER);
        // verification that we logged
    }

    public void createNewAccount(String emailAdress){
        createAccountEmail.sendKeys(emailAdress);
        createAccountBtn.click();
    }

    public void createNewAccount(String firstName,String lastName,String password,String address,
                                 String city, String state, String country,String mobilePhone, String aliasAddress){


    }

}
