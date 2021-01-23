package com.AlphaSense.pages;

import com.AlphaSense.utilities.BrowserUtils;
import com.AlphaSense.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    public WebElement basePageSignIn;

    @FindBy(css = ".account span")
    public WebElement loggedUser;

    @FindBy(css = "nav div a")
    public List<WebElement>navBarHeaders;

    @FindBy(id = "search_query_top")
    public WebElement searchBar;

    @FindBy(className = "heading-counter")
    public WebElement itemsCount;

    @FindBy(css = ".logout")
    public WebElement logout;


    public void clickLink(String link){
        Driver.get().findElement(By.cssSelector("a[title='"+link+"']")).click();
    }



    public void searchItem(String itemName){
        searchBar.sendKeys(itemName, Keys.ENTER);
    }



}
