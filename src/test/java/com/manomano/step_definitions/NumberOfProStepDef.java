package com.manomano.step_definitions;

import com.manomano.pages.NumberOfProPage;
import com.manomano.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class NumberOfProStepDef {

    public static WebDriver driver;

    NumberOfProPage numb = new NumberOfProPage();
    @When("user select {string} under products")
    public void user_select_under_products(String string) {

        BrowserUtils.hover(numb.products);
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(numb.animal);
        BrowserUtils.waitFor(1);
        numb.bee.click();


    }

    @Then("check how many products listed and shown on page")
    public void check_how_many_products_listed_and_shown_on_page() {
        String priProNum = numb.productsNumber.getText()+ " found";
        System.out.println("priProNum = " + priProNum);

        BrowserUtils.waitFor(1);

        numb.hotel.click();
        String secProNum = numb.secProNumber.getText();
        System.out.println("secProNum = " + secProNum);

        Assert.assertEquals(secProNum,priProNum);

    }

}
