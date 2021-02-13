package com.AlphaSense.pages;

import com.AlphaSense.utilities.*;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.regex.Pattern;

public class AccountCreationPage extends BasePage{

    //TITLE PART
    @FindBy(id = "id_gender1")
    public WebElement titleMR;

    @FindBy(id = "id_gender12")
    public WebElement titleMRS;

    @FindBy(id = "customer_firstname")
    public WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    public WebElement customerLastName;

    // use getAttribute method to get the value
    @FindBy(id = "email")
    public WebElement newAccountPageEmail;

    @FindBy(id = "passwd")
    public WebElement newAccountPagePassword;

    @FindBy(id = "days")
    public WebElement dropdownDays;

    @FindBy(id = "months")
    public WebElement dropdownMonths;

    @FindBy(id = "years")
    public WebElement dropdownYears;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheckBox;

    @FindBy(id = "optin")
    public WebElement specialOfferCheckBox;


    //ADDRESS

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement companyName;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id="address2")
    public WebElement address2;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id="id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement postalCode;

    @FindBy(id = "id_country")
    public WebElement dropDownCountry;

    @FindBy(id = "other")
    public WebElement typeAdditionalInformation;

    @FindBy(id = "phone")
    public WebElement homePhone;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhone;

    @FindBy(id = "alias")
    public WebElement aliasAddress;

    @FindBy(id = "submitAccount")
    public WebElement registerBtn;

    @FindBy(tagName = "h1")
    public WebElement h1;





    public void createNewAccount(String firstName,String lastName,String address,
                                 String cityName, String stateName, String postalCodes, String countryName,
                                 String mobilePhoneStr, String aliasAddressStr){
        //generating random zip code
        if(!postalCodes.isEmpty()){
            postalCode.sendKeys(postalCodes);
        }else{
            Faker faker = new Faker();
            String str = "0"+faker.address().zipCode();
            String newPostal = str.substring(0,5);
            postalCodes=newPostal;
            postalCode.sendKeys(postalCodes);
        }

        //country name should be united states
        String united_states = new StringBuilder(countryName).delete(0, countryName.length()).append("United States").toString();
        customerFirstName.sendKeys(firstName);
        customerLastName.sendKeys(lastName);
        //address1.sendKeys(faker.address().streetAddress());
        address1.sendKeys(address);
        city.sendKeys(cityName);
        state.sendKeys(stateName);
        Select sel = new Select(dropDownCountry);
        sel.selectByVisibleText(united_states);
        mobilePhone.sendKeys(mobilePhoneStr);
        aliasAddress.sendKeys(aliasAddressStr);

    }

    public String passwordGenerate(){
        return PasswordGenerator.getRandomPassword(7);

    }

    public String passwordGenerate2(){
        return PasswordGenerator.getRandomPassword(7);

    }

    //if needed
    public void dateOfBirth(String day,String month, String year){
        Select daySelection = new Select(dropdownDays);
        Select monthSelection = new Select(dropdownMonths);
        Select yearSelection = new Select(dropdownYears);

        daySelection.selectByVisibleText(day);
        monthSelection.selectByVisibleText(month);
        yearSelection.selectByVisibleText(year);
    }


}
