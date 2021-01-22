package com.AlphaSense.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends BasePage{

    @FindBy(xpath = "(//a[contains(@class,'button-small')])[2]")
    public WebElement details;

    @FindBy(linkText = "Download your invoice as a PDF file.")
    public WebElement downloadPDFBtn;
}
