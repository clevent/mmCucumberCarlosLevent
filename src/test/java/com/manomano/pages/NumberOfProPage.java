package com.manomano.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NumberOfProPage extends BasePage{

    @FindBy(xpath = "//div/nav[2]/div[1]/button")
    public WebElement products;

    @FindBy(xpath = "//*[@id=\"headerContainer\"]/div[1]/nav[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/a[1]")
    public WebElement animal;

    @FindBy(xpath = "//*[@id=\"headerContainer\"]/div[1]/nav[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/ul[1]/li[9]/a[1]")
    public WebElement bee;

    @FindBy(xpath = "//*[@id=\"content-body\"]/div[3]/div[1]/p[1]")
    public WebElement productsNumber;

    @FindBy(xpath = "//*[@id=\"content-body\"]/div[3]/div[1]/h2[1]/a[1]")
    public WebElement hotel;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/div[1]/div[1]/div[1]")
    public WebElement secProNumber;

}
