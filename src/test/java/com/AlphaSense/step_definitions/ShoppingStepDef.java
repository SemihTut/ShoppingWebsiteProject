package com.AlphaSense.step_definitions;

import com.AlphaSense.pages.*;
import com.AlphaSense.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class ShoppingStepDef {

    ProductsPage productsPage = new ProductsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ShoppingCartAddressPage shoppingCartAddressPage = new ShoppingCartAddressPage();
    ShoppingCartShippingPage shoppingCartShippingPage = new ShoppingCartShippingPage();
    ShoppingCartPaymentPage shoppingCartPaymentPage = new ShoppingCartPaymentPage();
    String colorGlobal;

    @Given("User select one of the item from the list")
    public void User_select_one_of_the_item_from_the_list() {
        productsPage.firstItem.click();
        BrowserUtils.waitForPageToLoad(5);
       // BrowserUtils.waitForVisibility(productsPage.addToCartBtn,5);

    }

    @Given("User adds the item to the shopping cart")
    public void user_adds_the_item_to_the_shopping_cart() {
        productsPage.addToCartBtn.click();
        BrowserUtils.waitForVisibility(productsPage.proceedCheckout2,5);
    }

    @Given("User proceeds to checkout")
    public void user_proceeds_to_checkout() {
        productsPage.proceedCheckout2.click();
    }

    @Given("User proceeds to checkout from Summary")
    public void user_proceeds_to_checkout_from_Summary() {
        BrowserUtils.waitForVisibility(shoppingCartPage.navigationPage,5);
        colorGlobal = shoppingCartPage.checkBackgroundColor(shoppingCartPage.summary);
        System.out.println("colorGlobal = " + colorGlobal);
        shoppingCartPage.proceedToCheckout.click();

    }

    @Given("User proceeds to checkout from Address")
    public void user_proceeds_to_checkout_from_Address() {
        BrowserUtils.waitForVisibility(shoppingCartAddressPage.deliveryAddress,5);
        shoppingCartPage.proceedToCheckout.click();
    }

    @Given("User proceeds to checkout from Shipping")
    public void user_proceeds_to_checkout_from_Shipping() {
        BrowserUtils.waitForVisibility(shoppingCartShippingPage.termsOfService,5);
        shoppingCartShippingPage.termsOfService.click();
        shoppingCartPage.proceedToCheckout.click();
    }

    @Given("User selects the payment type as {string}")
    public void user_selects_the_payment_type_as(String paymentTypeStr) {

        BrowserUtils.waitForVisibility(shoppingCartPaymentPage.paymentType(paymentTypeStr),5);
        shoppingCartPaymentPage.paymentType(paymentTypeStr).click();
        BrowserUtils.waitForVisibility(shoppingCartPage.confirmationBtn,5);
    }

    @Given("User confirms the order")
    public void user_confirms_the_order() {
       shoppingCartPage.confirmationBtn.click();
       BrowserUtils.waitForVisibility(shoppingCartPage.orderConfirmationText,5);
        Assert.assertEquals(shoppingCartPage.orderConfirmationText.getText(),"ORDER CONFIRMATION");

    }
}
