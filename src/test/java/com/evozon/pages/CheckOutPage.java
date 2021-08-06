package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckOutPage extends BasePage {

    @FindBy(css=".page-title h1")
    private WebElementFacade checkoutPageTitle;

    @FindBy(css= "input[title=\"Ship to this address\"]")
    private WebElementFacade radioBtnSkipToThisAddress;

    @FindBy(css= "#billing-buttons-container button[title=\"Continue\"]")
    private WebElementFacade continueButton1;

    @FindBy(css="input[id=\"s_method_freeshipping_freeshipping\"]")
    private WebElementFacade freeShippingRadioBtn;


    @FindBy(css="#shipping-method-buttons-container button")
    private WebElementFacade continueButton2;

    @FindBy(css="#payment-buttons-container > button")
    private WebElementFacade paymentInfoContinueBtn;


    @FindBy(css="td .product-name")
    private WebElementFacade orderProductName;


    @FindBy(css=".btn-checkout")
    private WebElementFacade placeOrderBtn;

    public void clickOnPlaceOrderBtn(){
        clickOn(placeOrderBtn);
    }


    public String getTextOfOrderProductName(){
        return orderProductName.getText();
    }


    public void clickOnPaymentContinueBtn(){
        waitForTextToAppear("Cash On Delivery",10000);
        //element(paymentInfoContinueBtn).waitUntilEnabled();
        clickOn(paymentInfoContinueBtn);
    }

    public void clickOnFreeShippingRadioBtn(){
        clickOn(freeShippingRadioBtn);
    }


    public String getCheckoutTitle(){
        return checkoutPageTitle.getText();
    }

    public void clickOnShipToThisAddressButton(){
        clickOn(radioBtnSkipToThisAddress);
    }


    public void clickContinueButton1(){
        clickOn(continueButton1);
    }


    public void clickContinueButton2(){
        clickOn(continueButton2);
    }


    public void waitForPage(){
        waitABit(10000);
    }

}
