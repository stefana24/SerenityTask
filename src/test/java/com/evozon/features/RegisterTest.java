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
        registerSteps.verifyMsgWhenFirstNameLeftEmpty();
        registerSteps.verifyMsgWhenLastNameLeftEmpty();
        registerSteps.verifyMsgWhenEmailLeftEmpty();
        registerSteps.verifyMsgWhenPasswordLeftEmpty();
        registerSteps.fillInFormAndCheckNewsletter();
        logInStep.verifyLoggedIn(Constants.user);
    }

}
