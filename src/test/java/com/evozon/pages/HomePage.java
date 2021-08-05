package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.dev.evozon.com/")
public class HomePage extends BasePage {

    @FindBy(css = "a[href*='/account'] .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy(css="a[title='Register'")
    private WebElementFacade registerLink;

    public void clickOnAccount(){
        clickOn(accountLink);
    }
    public void clickOnLogInLink(){
        clickOn(logInLink);
    }

    public void clickOnRegisterLink(){
        clickOn(registerLink);
    }
}
