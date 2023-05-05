package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By bankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");

    public void clickOnBankManagerLogin() {
        clickOnElement(bankManagerLogin);
    }

}
