package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By addCustomer = By.xpath("//button[normalize-space()='Add Customer']");
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@type='submit']");


    public void clickOnAddCustomer(){
        clickOnElement(addCustomer);
    }
    public void fillingTheForm(String firstname,String lastname,String postcode){
        sendTextToElement(firstNameField,firstname);
        sendTextToElement(lastNameField,lastname);
        sendTextToElement(postCodeField,postcode);
       // clickOnElement(addCustomerButton);
    }
    public void clickOnAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }
}
