package com.AlphaSense.step_definitions;

import com.AlphaSense.pages.AccountCreationPage;
import com.AlphaSense.pages.LoginPage;
import com.AlphaSense.pages.ProductsPage;
import com.AlphaSense.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class ProductsStepDef {

    LoginPage loginPage=new LoginPage();
    AccountCreationPage creationPage = new AccountCreationPage();
    ProductsPage productsPage = new ProductsPage();
    String resultGlobal;
    String productNameGlobal;

    @When("User enters {string} as a search item")
    public void user_enters_as_a_search_item(String productName) {
        productNameGlobal=productName;
        productsPage.searchItem(productNameGlobal);
    }

    @Then("User should be able to see results and responsive products")
    public void user_should_be_able_to_see_results_and_responsive_products() {
        BrowserUtils.waitForVisibility(productsPage.productsCounter,5);
        resultGlobal = productsPage.productsCounter.getText();
        List<String> productsText = BrowserUtils.getElementsText(productsPage.productsTitle);
        System.out.println("productsText = " + productsText);
        for(String product:productsText){
            Assert.assertTrue(product.contains(productNameGlobal));
        }
    }

    @Then("product count should be {int}")
    public void product_count_should_be(int count) {
        int actual = productsPage.resultsCounter(resultGlobal);
        Assert.assertEquals(actual,count);
    }
}
