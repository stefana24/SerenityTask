package com.evozon.features;

import com.evozon.steps.serenity.*;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class CheckOutTest extends BaseTest{

    @Steps
    private ShoppingSteps shoppingSteps;

    @Steps
    private CategorySteps categorySteps;

    @Steps
    private ProductSteps productSteps;


    @Steps
    private LogInSteps logInStep;

    @Steps
    private CheckOutSteps checkOutSteps;


    @Test
    public void checkOutTest() {
        logInStep.loginWithValidCredentials();
        driver.navigate().to(Constants.BASE_URL);
        categorySteps.navigateToCategoryAndSubcategory("men", "new arrivals");
        categorySteps.clickOnProduct(Constants.PRODUCT);
        productSteps.clickOnAddToCart();
        productSteps.verifyColorErrorMessage();
        productSteps.verifySizeErrorMessage();
        productSteps.setColor("White");
        productSteps.setSize("M");
        productSteps.clickOnAddToCart();
        shoppingSteps.verifyMessageWhenProductWasAdded(Constants.PRODUCT);
        shoppingSteps.verifyProductWasAddedInContainer(Constants.PRODUCT);
        checkOutSteps.verifyUserIsRedirectedToCheckOutPage();
        checkOutSteps.saveBillingInformation();
        checkOutSteps.freeShippingMethod();
        checkOutSteps.payment();
        checkOutSteps.verifyProductTitleFromOrderReview(Constants.PRODUCT);
        checkOutSteps.clickOnPlaceOrderBtn();

        checkOutSteps.verifySuccessOrderMsg(Constants.SUCCESS_MSG_ORDER);


    }

}
