package com.manomano.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchProduct extends BasePage{


    @FindBy(id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    public WebElement cookies;

    @FindBy(id = "searchbar")
    public WebElement searchbar;

    @FindBy(xpath = "//div/div[1]/h1")
    public WebElement headLine;

    @FindBy(xpath = "//div[contains(text(),'products ')]")
    public WebElement paginationCountText;

    @FindBy(xpath = "//ul/a/li")
    public List<WebElement> paginationItem;

    @FindBy(xpath = "//ul[@class='pagination_484f3221']")
    public WebElement pageNavigationMenu;

    @FindBy(xpath = "//ul/a/li[@rel='next']")
    public WebElement nextPageBtn;

    @FindBy(id = "label-sorting")
    public WebElement sortByMenu;

    @FindBy(xpath = "//div[@class='RadioSelectItem_root__2c62i']/div/input")
    public WebElement relevance;

    @FindBy(xpath = "//div[@class='RadioSelectItem_root__2c62i']")
    public WebElement relevanceText;




    public void selectPage(String pageNum){
        for (WebElement element : paginationItem) {
            System.out.println(element.getText());
            if(element.getText().equals(pageNum)){
                element.click();
                break;
            }

        }
    }
}
