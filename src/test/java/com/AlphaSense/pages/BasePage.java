package com.AlphaSense.pages;


import com.AlphaSense.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public abstract class BasePage {
    //If a subclass constructor does not explicitly call a superclass constructor, Java will automatically
    // call the superclass’s default constructor, or no-arg constructor,
    // just before the code in the subclass’s constructor executes.
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
