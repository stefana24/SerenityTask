package com.evozon.features;

import com.evozon.steps.serenity.LogInStep;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class LogInTest extends BaseTest {
    @Steps
    private LogInStep loginStep;

    @Test
    public void loginTestWithValidUsername(){
        loginStep.navigateToLoginPage();
        loginStep.loginWithCredentials(Constants.USER_EMAIL,Constants.USER_PASS);
        loginStep.verifyLoggedIn(Constants.NEW_USERNAME);
    }

}
