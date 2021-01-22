package com.AlphaSense.step_definitions;

import com.AlphaSense.pages.AccountCreationPage;
import com.AlphaSense.pages.LoginPage;
import com.AlphaSense.utilities.*;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class LoginStepDefs {

    LoginPage loginPage=new LoginPage();
    AccountCreationPage creationPage = new AccountCreationPage();
    String firstN;
    String lastN;
    String passwordGlobal;
    String emailGlobal;

    @Given("the user is on the web-page")
    public void the_user_is_on_the_web_page() {
        Driver.get().get(ConfigurationReader.get("loginUrl"));
        Driver.get().manage().window().maximize();

    }

    @When("the user enter email {string} and password {string}")
    public void the_user_enter_and(String email, String password) {
        if(password.isEmpty()){
            loginPage.loginForRegisteredUser(email,EmailReader.get(email));
        }else{
            loginPage.loginForRegisteredUser(email,password);
        }

    }
    @Then("the user should be able to sigIn")
    public void the_user_should_be_able_to_sigIn() {
        BrowserUtils.waitForPageToLoad(3);
        System.out.println("loginPage.loggedUserName.getText() = " + loginPage.loggedUserName.getText());

    }

    @When("the user enter emailAddress {string}")
    public void the_user_enter(String email) {
        BrowserUtils.waitForVisibility(loginPage.createAccountBtn,10);
        StringBuilder sb = new StringBuilder(email);
        emailGlobal=sb.append(EmailGenerator.getEmail()).toString();

        loginPage.createAccountEmail.sendKeys(emailGlobal);


    }

    @When("Click the create an account button")
    public void click_the_create_an_account_button() {
        loginPage.createAccountBtn.click();
    }

    @When("User should be on Account Creation Page")
    public void user_should_be_on_Account_Creation_Page() {
        BrowserUtils.waitForVisibility(creationPage.address1,5);
    }

    @When("User enters the {string}, {string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_enters_the(String firstname, String lastName, String address,
                                String cityName, String stateName, String postalCode,
                                String countryName, String mobile, String aliassAddress) {
        firstN=new StringBuilder(firstname).toString();
        lastN=new StringBuilder(lastName).toString();
       // passwords = PasswordGenerator.getRandomPassword(7);
        creationPage.createNewAccount(firstN,lastN,address,cityName,stateName,postalCode,countryName,mobile,aliassAddress);
        passwordGlobal=creationPage.passwordGenerate();
        creationPage.newAccountPagePassword.sendKeys(passwordGlobal);
        EmailReader.setProperties(emailGlobal,passwordGlobal);
        creationPage.registerBtn.click();

    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        BrowserUtils.waitForPageToLoad(3);
       // Assert.assertEquals(Driver.get().getTitle(),"My account - My Store");

    }

}
