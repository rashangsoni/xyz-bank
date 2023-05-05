package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");
    By customerNameField = By.xpath("//select[@id='userSelect']");
    By currencyField = By.xpath("//select[@id='currency']");
    By processButton = By.xpath("//button[normalize-space()='Process']");

    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
    public void setCustomerDetail(String customer,String currency){
        selectByVisibleTextFromDropDown(customerNameField,customer);
        selectByVisibleTextFromDropDown(currencyField,currency);
    }
    public void clickOnProcess(){
        clickOnElement(processButton);
    }
}
