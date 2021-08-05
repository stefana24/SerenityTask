package com.evozon.features;

import com.evozon.steps.serenity.LogInSteps;
import com.evozon.steps.serenity.RegisterSteps;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Steps
    private RegisterSteps registerSteps;

    @Steps
    private LogInSteps logInStep;


    @Test
    public void registrationTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.verifyMessageWhenFirstNameLeftEmpty();
        registerSteps.verifyMessageWhenLastNameLeftEmpty();
        registerSteps.verifyMessageWhenEmailLeftEmpty();
        registerSteps.verifyMessageWhenPasswordLeftEmpty();
        registerSteps.fillInFormAndCheckNewsletter();
        logInStep.verifyLoggedIn(Constants.USER);
    }

}
