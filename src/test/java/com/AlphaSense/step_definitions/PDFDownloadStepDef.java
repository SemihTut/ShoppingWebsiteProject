package com.AlphaSense.step_definitions;

import com.AlphaSense.pages.OrdersPage;
import com.AlphaSense.utilities.BrowserUtils;
import com.AlphaSense.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class PDFDownloadStepDef {

    OrdersPage ordersPage = new OrdersPage();
    @When("User clicks the link {string}")
    public void user_clicks_the_link(String link) {
        ordersPage.clickLink(link);
        BrowserUtils.waitForPageToLoad(5);


    }

    @When("User clicks the order details")
    public void user_clicks_the_order_details() {
        ordersPage.details.click();
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("User should make sure that the PDF is downloaded")
    public void user_should_make_sure_that_the_PDF_is_downloaded() {
        System.out.println("Before click the download " + Driver.get().getWindowHandles().size());
        ordersPage.downloadPDFBtn.click();
        BrowserUtils.waitForPageToLoad(3);
        System.out.println("After click the download " + Driver.get().getWindowHandles().size());
        Assert.assertTrue(Driver.get().getWindowHandles().size()>1);
        BrowserUtils.waitFor(5);
    }
}
