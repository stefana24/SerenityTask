package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CategoryPage extends BasePage {

    @FindBy(css="#nav .nav-primary > li")
    private List<WebElementFacade> productCategoriesList;

    @FindBy(css=".catblocks a span")
    private List<WebElementFacade> productSubcategoriesList;

    @FindBy(css=".products-grid .product-name")
    private  List<WebElementFacade> productsFromSubcategoriesList;

    public void navigateToCategory(String categoryTitle){
        for(WebElementFacade productCategory: productCategoriesList){
            if(productCategory.getText().equalsIgnoreCase(categoryTitle)){
                clickOn(productCategory);
                break;
            }
        }
    }

    public void navigateToSubcategory(String subcategoryTitle){
        for (WebElementFacade productSubcategory : productSubcategoriesList) {
            if (productSubcategory.getText().equalsIgnoreCase(subcategoryTitle)) {
                clickOn(productSubcategory);
                break;
            }
        }
    }

    public void clickOnProduct(String productName){
        for(WebElementFacade product: productsFromSubcategoriesList){
            if(product.getText().equalsIgnoreCase(productName)){
                clickOn(product);
                break;
            }
        }
    }

}
