package com.AlphaSense.tests;

import com.AlphaSense.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class google {

    @Test
    public void activeElementTest() throws InterruptedException {

        Driver.get().get("https://www.facebook.com/");
        Driver.get().manage().window().maximize();

        WebElement activeElement = Driver.get().switchTo().activeElement();
        activeElement.sendKeys("Selenium");
        activeElement.sendKeys(Keys.TAB,Keys.ENTER);

    }
}
