package com.manomano.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchEstimatePage extends BasePage{

    @FindBy(id = "searchbar")
    public WebElement searchbar;

    @FindBy(xpath = "//*[@id=\"searchbar-form\"]/div[2]/div[1]/div[3]/a[1]/span[1]")
    public WebElement brands;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/div[1]/h1[1]")
    public WebElement headline;



}
