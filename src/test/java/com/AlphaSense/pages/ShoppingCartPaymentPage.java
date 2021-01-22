package com.AlphaSense.pages;

import com.AlphaSense.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPaymentPage extends ShoppingCartPage{


    public WebElement paymentType(String str){

        return Driver.get().findElement(By.cssSelector("a[title='"+str+"']"));
    }


}

