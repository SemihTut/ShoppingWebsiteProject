package com.AlphaSense.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ProductsPage extends BasePage{

    @FindBy(className = "heading-counter")
    public WebElement productsCounter;

    @FindBy(css = ".product_list.grid.row h5")
    public List<WebElement>productsTitle;

    @FindBy(xpath = "(//ul[@class='product_list grid row']//li[1])[1]")
    public WebElement firstItem;

    @FindBy(name = "Submit")
    public WebElement addToCartBtn;

    @FindBy(css = "a[title='Proceed to checkout'] span")
    public WebElement proceedCheckout2;


    //Product successfully added to your shopping cart
    public int resultsCounter(String str){
        String s = str.replaceAll("[^\\d+]", "").trim();
        return Integer.parseInt(s);
    }
}
