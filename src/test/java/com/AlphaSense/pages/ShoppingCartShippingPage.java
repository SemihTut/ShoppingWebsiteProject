package com.AlphaSense.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartShippingPage extends ShoppingCartPage{

    @FindBy(tagName = "label")
    public WebElement termsOfService;
}
