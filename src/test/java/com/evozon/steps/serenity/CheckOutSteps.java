package com.evozon.steps.serenity;

import com.evozon.pages.CheckOutPage;
import com.evozon.pages.ShoppingCartPage;
import com.evozon.pages.SuccessOrderPage;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckOutSteps {

    private CheckOutPage checkOutPage;
    private ShoppingCartPage shoppingCartPage;
    private SuccessOrderPage successOrderPage;


    @Step
    public void verifyUserIsRedirectedToCheckOutPage(){
        shoppingCartPage.clickOnProceedToCheckOutButton();
        Assert.assertTrue(checkOutPage.getCheckoutTitle().equalsIgnoreCase(Constants.CHECKOUT));
    }

    @Step
    public void saveBillingInformation() {
        checkOutPage.clickOnShipToThisAddressButton();
        checkOutPage.clickContinueButton1();
    }

    @Step
    public void freeShippingMethod(){
        checkOutPage.clickOnFreeShippingRadioBtn();
        checkOutPage.clickContinueButton2();
    }

    @Step
    public void payment(){
        checkOutPage.clickOnPaymentContinueBtn();
    }

    @Step
    public void verifyProductTitleFromOrderReview(String productName){
        Assert.assertTrue(checkOutPage.getTextOfOrderProductName().equalsIgnoreCase(productName));
    }

    @Step
    public void clickOnPlaceOrderBtn(){
        checkOutPage.clickOnPlaceOrderBtn();
    }

    @Step
    public void verifySuccessOrderMsg(String successMsg){
        //checkOutPage.waitForPage();
        Assert.assertTrue(successOrderPage.getTextOfsuccessOrderMsg().equalsIgnoreCase(successMsg));
    }

}
