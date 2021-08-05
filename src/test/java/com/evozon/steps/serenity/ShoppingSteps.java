package com.evozon.steps.serenity;

import com.evozon.pages.ShoppingCartPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ShoppingSteps {

    private ShoppingCartPage shoppingcartPage;

    @Step
    public void verifyMessageProductWasAdded(String productName){
        Assert.assertTrue(shoppingcartPage.isAddedMessage(productName));
    }

    @Step
    public void verifyProductWasAddedInContainer(String productName){
        Assert.assertTrue(shoppingcartPage.isProductInCart(productName) );
    }
}
