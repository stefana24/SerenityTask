package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SuccessOrderPage extends BasePage{

    @FindBy(css=".sub-title")
    private WebElementFacade successOrderMsg;

    public String getTextOfsuccessOrderMsg(){
        return successOrderMsg.getText();
    }
}
