package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {
   By customer = By.xpath("//button[normalize-space()='Customers']");

    public void clickOnCustomer(){
       clickOnElement(customer);
    }
}
