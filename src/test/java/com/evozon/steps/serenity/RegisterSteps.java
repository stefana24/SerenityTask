package com.evozon.steps.serenity;

import com.evozon.pages.HomePage;
import com.evozon.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;

    @Step
    public void navigateToRegisterPage() {
        homePage.clickOnAccount();
        homePage.clickOnRegisterLink();
    }

    @Step
    public void verifyMessageWhenFirstNameLeftEmpty() {
        registerPage.insertDataWithoutFirstName();
        registerPage.clickOnRegisterBtn();
        Assert.assertTrue(registerPage.isRequiredFieldMsgDisplayed());
    }

    @Step
    public void verifyMessageWhenLastNameLeftEmpty() {
        //registerPage.makeFieldsEmpty();
        getDriver().navigate().refresh();
        registerPage.insertDataWithoutLastName();
        registerPage.clickOnRegisterBtn();
        Assert.assertTrue(registerPage.isRequiredFieldMsgDisplayed());
    }

    @Step
    public void verifyMessageWhenEmailLeftEmpty() {
//        registerPage.makeFieldsEmpty();

        registerPage.insertDataWithoutEmail();
        registerPage.clickOnRegisterBtn();
        Assert.assertTrue(registerPage.isRequiredFieldMsgDisplayed());
    }

    @Step
    public void verifyMessageWhenPasswordLeftEmpty() {
//        registerPage.makeFieldsEmpty();
        registerPage.insertDataWithoutPassword();
        registerPage.clickOnRegisterBtn();
        Assert.assertTrue(registerPage.isRequiredFieldMsgDisplayed());
    }

    @Step
    public void fillInFormAndCheckNewsletter() {
        registerPage.fillInForm();
        registerPage.clickOnCheckBox();
        registerPage.clickOnRegisterBtn();
    }
}
