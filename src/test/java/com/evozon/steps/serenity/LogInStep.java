package com.evozon.steps.serenity;

import com.evozon.pages.DashboardPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.LogInPage;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LogInStep {
    private HomePage homePage;
    private LogInPage loginPage;
    private DashboardPage dashboardPage;

    @Step
    public void navigateToLoginPage(){
        //homePage.open();
        homePage.clickOnAccount();
        homePage.clickOnLogInLink();
    }

    @Step
    public void loginWithCredentials(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickOnLoginButton();
    }
    @Step
    public void verifyLoggedIn(String value){
        Assert.assertTrue(dashboardPage.isWelcomeMessage(value));
    }

    @Step
    public void loggInSteps(){
        navigateToLoginPage();
        loginWithCredentials(Constants.USER_EMAIL,Constants.USER_PASS);
        verifyLoggedIn(Constants.NEW_USERNAME);
    }
}
