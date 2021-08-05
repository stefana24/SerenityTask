package com.evozon.steps.serenity;

import com.evozon.pages.CategoryPage;
import com.evozon.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class CategorySteps {
    private CategoryPage categoryPage;

    @Step
    public void navigateToCategoryAndSubcategory(String categoryTitle,String categorySubtitle){
        categoryPage.navigateToCategory(categoryTitle);
        categoryPage.navigateToSubcategory(categorySubtitle);
    }

    @Step
    public void clickOnProduct(String productName){
        categoryPage.clickOnProduct(productName);
    }


}
