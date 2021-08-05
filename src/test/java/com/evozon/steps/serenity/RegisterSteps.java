package com.evozon.steps.serenity;

import com.evozon.pages.HomePage;
import com.evozon.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps {
    private HomePage homePage;
    private RegisterPage registerPage;

    @Step
    public void navigateToRegisterPage(){
        homePage.clickOnAccount();
        homePage.clickOnRegisterLink();
    }

    @Step
    public void verifyMsgWhenFirstNameLeftEmpty(){
        registerPage.insertDataWithoutFirstName();
        registerPage.clickOnRegisterBtn();
        Assert.assertTrue(registerPage.isRequiredFieldMsgDisplayed());
    }

    @Step
    public void verifyMsgWhenLastNameLeftEmpty(){
        registerPage.makeFieldsEmpty();
        registerPage.insertDataWithoutLastName();
        registerPage.clickOnRegisterBtn();
        Assert.assertTrue(registerPage.isRequiredFieldMsgDisplayed());
    }

    @Step
    public void verifyMsgWhenEmailLeftEmpty(){
//        registerPage.makeFieldsEmpty();
        registerPage.insertDataWithoutEmail();
        registerPage.clickOnRegisterBtn();
        Assert.assertTrue(registerPage.isRequiredFieldMsgDisplayed());
    }

    @Step
    public void verifyMsgWhenPasswordLeftEmpty(){
//        registerPage.makeFieldsEmpty();
        registerPage.insertDataWithoutPassword();
        registerPage.clickOnRegisterBtn();
        Assert.assertTrue(registerPage.isRequiredFieldMsgDisplayed());
    }

    @Step
    public void fillInFormAndCheckNewsletter(){
        registerPage.fillInForm();
        registerPage.clickOnCheckBox();
        registerPage.clickOnRegisterBtn();
    }
}
