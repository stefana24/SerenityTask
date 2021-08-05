package com.evozon.features;

import com.evozon.steps.serenity.LogInStep;
import com.evozon.steps.serenity.RegisterSteps;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Steps
    private RegisterSteps registerSteps;

    @Steps
    private LogInStep logInStep;


    @Test
    public void registrationWithoutFirstNameTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.verifyMsgWhenFirstNameLeftEmpty();
        registerSteps.verifyMsgWhenLastNameLeftEmpty();
//        registerSteps.verifyMsgWhenEmailLeftEmpty();
//        registerSteps.verifyMsgWhenPasswordLeftEmpty();
        registerSteps.fillInFormAndCheckNewsletter();
        logInStep.verifyLoggedIn(Constants.user);
    }

}
