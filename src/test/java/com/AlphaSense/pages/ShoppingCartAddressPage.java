package com.AlphaSense.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartAddressPage extends ShoppingCartPage{


    @FindBy(css = "ul[id='address_delivery'] h3[class='page-subheading']")
    public WebElement deliveryAddress;

}
