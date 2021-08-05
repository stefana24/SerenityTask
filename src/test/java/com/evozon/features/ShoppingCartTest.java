package com.evozon.features;


import com.evozon.steps.serenity.CategorySteps;
import com.evozon.steps.serenity.LogInStep;
import com.evozon.steps.serenity.ProductSteps;
import com.evozon.steps.serenity.ShoppingSteps;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class ShoppingCartTest extends BaseTest{

    @Steps
    private CategorySteps categorySteps;

    @Steps
    private ProductSteps productSteps;

    @Steps
    private ShoppingSteps shoppingSteps;

    @Steps
    private LogInStep logInStep;


    @Test
    public void addProductToCartWithLoginTest(){
        logInStep.loggInSteps();
        driver.navigate().to(Constants.BASE_URL);
        categorySteps.navigateToCategoryAndSubcategory("men","new arrivals");
        categorySteps.clickOnProduct("linen blazer");
        productSteps.clickOnAddToCart();
        productSteps.verifyColorErrorMessage();
        productSteps.verifySizeErrorMessage();
        productSteps.setColor("White");
        productSteps.setSize("M");
        productSteps.clickOnAddToCart();
        shoppingSteps.verifyMessageProductWasAdded("linen blazer");
        shoppingSteps.verifyProductWasAddedInContainer("linen blazer");
    }
}
