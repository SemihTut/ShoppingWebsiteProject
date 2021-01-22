package com.AlphaSense.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductsPage extends BasePage{

    @FindBy(className = "heading-counter")
    public WebElement productsCounter;

    @FindBy(css = ".product_list.grid.row h5")
    public List<WebElement>productsTitle;

    @FindBy(xpath = "(//ul[@class='product_list grid row']//li[1])[1]")
    public WebElement firstItem;

    @FindBy(name = "Submit")
    public WebElement addToCartBtn;

    @FindBy(css = ".hovered div.button-container a:nth-child(1)")
    public WebElement addToCartBtnHover;

    @FindBy(css = ".clearfix div:nth-child(2) div.button-container a")
    public WebElement proceedCheckout;

    @FindBy(css = "a[title='Proceed to checkout'] span")
    public WebElement proceedCheckout2;

    //trying sth
    @FindBy(css = "a[title='Women']")
    public WebElement women;

    //Product successfully added to your shopping cart
    public int resultsCounter(String str){
        String s = str.replaceAll("[^\\d+]", "").trim();
        return Integer.parseInt(s);
    }
}
