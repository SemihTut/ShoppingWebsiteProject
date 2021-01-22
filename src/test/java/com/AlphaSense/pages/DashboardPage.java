package com.AlphaSense.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(css = ".page-heading")
    public WebElement pageHeading;


}
