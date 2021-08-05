package com.evozon.steps.serenity;

import com.evozon.pages.CategoryPage;
import net.thucydides.core.annotations.Step;

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
