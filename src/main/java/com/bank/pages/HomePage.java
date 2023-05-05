package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By home = By.xpath("//button[normalize-space()='Home']");
    By yourNameField = By.xpath("//select[@id='userSelect']");
    By login = By.xpath("//button[normalize-space()='Login']");
    By logout = By.xpath("//button[normalize-space()='Logout']");


    public void clickOnHomeButton() {
        clickOnElement(home);
    }

    public void setYourName(String yourName) {
        selectByVisibleTextFromDropDown(yourNameField, yourName);
    }

    public void clickOnLogin() {
        clickOnElement(login);
    }

    public void clickOnLogout() {
        clickOnElement(logout);
    }
}