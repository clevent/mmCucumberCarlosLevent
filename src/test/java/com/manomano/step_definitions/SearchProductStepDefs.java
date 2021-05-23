package com.manomano.step_definitions;

import com.manomano.pages.SearchProduct;
import com.manomano.utilities.BrowserUtils;
import com.manomano.utilities.ConfigurationReader;
import com.manomano.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class SearchProductStepDefs {

    SearchProduct search = new SearchProduct();

    @Given("user should able to open main page")
    public void user_should_able_to_open_main_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(2);
        search.cookies.click();

    }

    @When("user should able to write product name {string} and click on search button")
    public void user_should_able_to_write_product_name_and_click_on_search_button(String product) {
        BrowserUtils.waitFor(2);
        search.searchbar.sendKeys(product);
        search.searchbar.sendKeys(Keys.ENTER);


    }

    @Then("user should see {string} at header")
    public void user_should_see_at_header(String header) {

        String actualHeadline = search.headLine.getText();
        String expectedHeadline = "« " + header +" »";
        Assert.assertEquals(expectedHeadline,actualHeadline);


    }

    @Then("user should see all related products sorted by {string}")
    public void user_should_see_all_related_products_sorted_by(String expectedSortType) {
        BrowserUtils.waitFor(2);
        search.sortByMenu.click();
        String actualSortType = search.relevanceText.getText();
        System.out.println(actualSortType);
        Assert.assertTrue(search.relevance.isSelected());
        Assert.assertEquals(expectedSortType,actualSortType);



    }

    @Then("user should see {int} products out of {int} at first page")
    public void user_should_see_products_out_of_at_first_page(Integer int1, Integer int2) {
        String expectedCountText = search.paginationCountText.getText();
        Assert.assertTrue(expectedCountText.contains(int1 + " products out of"));


    }

    @Then("user should able to go next page by click on {string}")
    public void user_should_able_to_go_next_page_by_click_on (String nextPage) {


        BrowserUtils.scrollToElement(search.pageNavigationMenu);
        BrowserUtils.waitFor(3);
        search.nextPageBtn.click();
        BrowserUtils.waitFor(3);
        String expectedCountText = search.paginationCountText.getText();
        Assert.assertEquals("120",expectedCountText.substring(0,3));

    }


}
