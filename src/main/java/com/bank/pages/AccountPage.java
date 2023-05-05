package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By deposit = By.xpath("//button[normalize-space()='Deposit']");
    By withdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    By amountToDeposite = By.xpath("//input[@placeholder='amount']");
    By deposit1 = By.xpath("//button[@type='submit']");
    By withdraw = By.xpath("//button[normalize-space()='Withdraw']");

    public void clickOnDeposite(){
        clickOnElement(deposit);
    }
    public void clickOnWithdrawl(){
        clickOnElement(withdrawl);
    }
    public void setDeposit(){
        sendTextToElement(amountToDeposite,"100");
    }
    public void clickOnDeposite1(){
        clickOnElement(deposit1);
    }
    public void setDeposit1(){
       sendTextToElement(amountToDeposite,"50");
    }
    public void clickOnWithdraw(){
        clickOnElement(withdraw);
    }

}
