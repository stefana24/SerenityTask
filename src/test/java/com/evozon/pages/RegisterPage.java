package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RegisterPage extends BasePage{

    @FindBy(css="button[title='Register']")
    private WebElementFacade registerButton;

    @FindBy(css=".form-list .input-box input[class*='input-text']")
    private List<WebElementFacade> createAccountFields;

    public List<WebElementFacade> getCreateAccountFields(){
        return createAccountFields;
    }


    @FindBy(css=".validation-advice")
    private WebElementFacade requiredFieldMessage;

    @FindBy(css="input[type='checkbox']")
    private WebElementFacade checkboxBtn;

    public void clickOnCheckBox(){
        clickOn(checkboxBtn);
    }

    public boolean isRequiredFieldMsgDisplayed(){
        return requiredFieldMessage.isDisplayed();
    }

    public void clickOnRegisterBtn(){
        clickOn(registerButton);
    }


    public void insertDataWithoutFirstName(){
        for(int i=1;i<createAccountFields.size();i++) {
            typeInto(createAccountFields.get(i), Constants.ACCOUNT_DATA_ARRAY[i]);
        }
    }

    //general function
    //index of field we want to left empty
    public void insertDataWithout(int index){
        for(int i=0;i<index;i++){
            typeInto(createAccountFields.get(i), Constants.ACCOUNT_DATA_ARRAY[i]);
        }
        for(int i=index+1;i<createAccountFields.size();i++) {
            typeInto(createAccountFields.get(i), Constants.ACCOUNT_DATA_ARRAY[i]);
        }
    }

    public void insertDataWithoutLastName(){
        insertDataWithout(2);
    }

    public void makeFieldsEmpty(){
        for(int i=0;i<createAccountFields.size();i++) {
            typeInto(createAccountFields.get(i),"");
        }
    }

    public void insertDataWithoutEmail(){
        makeFieldsEmpty();
        insertDataWithout(3);
    }

    public void insertDataWithoutPassword(){
        makeFieldsEmpty();
        insertDataWithout(4);
    }

    public void fillInForm(){
        typeInto(createAccountFields.get(0),Constants.ACCOUNT_DATA_ARRAY[0]);
        insertDataWithoutFirstName();
    }

}
