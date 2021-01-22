package com.AlphaSense.pages;

import com.AlphaSense.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "(//*[contains(text(),'Proceed to checkout')])[2]")
    public WebElement proceedToCheckout;

    @FindBy(css = ".bankwire")
    public WebElement payMethodBankWire;

    @FindBy(css = "#cart_navigation button")
    public WebElement confirmationBtn;

    @FindBy(css = "#order_step li")
    public List<WebElement> stepsPaymentList;

    @FindBy(xpath = "//li[contains(@class,'first')]//span[1]")
    public WebElement summary;

    @FindBy(css = "li[class='step_current third'] span:nth-child(1)")
    public WebElement address;

    @FindBy(css = "li[class='step_todo four'] span")
    public WebElement shipping;

    @FindBy(css = "li[id='step_end'] span:nth-child(1)")
    public WebElement payment;

    //helps us to figure out the page
    @FindBy(css = ".navigation_page")
    public WebElement navigationPage;

    @FindBy(tagName = "h1")
    public WebElement orderConfirmationText;

  //  @FindBy(xpath = "//*[contains(text(),'Sign in')]")


    public String checkBackgroundColor(WebElement element){

        return element.getCssValue("background-color");

    }
}
