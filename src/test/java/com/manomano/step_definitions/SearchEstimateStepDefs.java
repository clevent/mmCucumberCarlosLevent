package com.manomano.step_definitions;

import com.manomano.pages.SearchEstimatePage;
import com.manomano.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Locale;

public class SearchEstimateStepDefs {

    SearchEstimatePage est = new SearchEstimatePage();

    @When("user should able to write product name {string} and Stanley option under BRANDS")
    public void user_should_able_to_write_product_name_and_Stanley_option_under_BRANDS(String letters) {
       est.searchbar.sendKeys(letters.substring(0,1));
       est.searchbar.sendKeys(letters.substring(1,2));
       est.searchbar.sendKeys(letters.substring(2,3));

    }

    @Then("user should able to select STANLEY Brand option")
    public void user_should_able_to_select_STANLEY_Brand_option() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(est.brands);
        BrowserUtils.waitFor(1);
        est.brands.click();
    }

    @Then("user should see {string} brand products and headline at new page")
    public void user_should_see_brand_products_and_headline_at_new_page(String brand) {
       String actualHeadline = est.headline.getText();
       String expectedHeadline = brand.toUpperCase(Locale.ROOT);
        Assert.assertEquals(expectedHeadline,actualHeadline);
    }


}
