package com.evozon.steps.serenity;

import com.evozon.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductSteps{
    private ProductPage productPage;
    @Step
    public void clickOnAddToCart(){
        productPage.clickOnAddToCartBtn();
    }
    @Step
    public void verifyColorErrorMessage(){
        Assert.assertTrue(productPage.isColorRequiredMessage());
    }
    @Step
    public void verifySizeErrorMessage(){
        Assert.assertTrue(productPage.isSizeRequiredMessage());
    }

    @Step
    public void setColor(String color){
        productPage.selectColor(color);
    }

    @Step
    public void setSize(String size){
        productPage.selectSize(size);
    }
}
