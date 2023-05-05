package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By customerLogin = By.xpath("//button[normalize-space()='Customer Login']");

    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);
    }
}
