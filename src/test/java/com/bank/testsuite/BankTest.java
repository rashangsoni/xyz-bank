package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerPage customerPage = new CustomerPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();



@Test
    public void bankManagerShouldAddCustomerSuccessfully(){

       // click On "Bank Manager Login" Tab
         bankManagerLoginPage.clickOnBankManagerLogin();
       //  click On "Add Customer" Tab
         addCustomerPage.clickOnAddCustomer();//    enter FirstName
      //  enter LastName
      //  enter PostCode
      //  click On "Add Customer" Button
         addCustomerPage.fillingTheForm("Prime","Testing","HA2 9SE");
         addCustomerPage.clickOnAddCustomerButton();
     //  popup display
         switchToAlert();
     //  verify message "Customer added successfully"
          String expectedMessage =  "Customer added successfully";
          String actualMessage = getTextFromAlert();
          Assert.assertTrue(actualMessage.contains(expectedMessage));
     //     click on "ok" button on popup.
          acceptAlert();

    }

    @Test
    public void  bankManagerShouldOpenAccountSuccessfully()  {

           bankManagerShouldAddCustomerSuccessfully();
           // click On "Open Account" Tab
           openAccountPage.clickOnOpenAccount();
           // Select currency "Pound"
           openAccountPage.setCustomerDetail("Prime Testing","Pound");
           openAccountPage.clickOnProcess();
          // popup display
          switchToAlert();
          // verify message "Customer added successfully"
          String expectedMessage1 =  "Account created successfully";
          String actualMessage1 = getTextFromAlert();
          Assert.assertTrue(actualMessage1.contains(expectedMessage1));
          // click on "ok" button on popup.
          acceptAlert();


}
    @Test
    public void customerShouldLoginAndLogoutSuccessfully(){
            bankManagerShouldOpenAccountSuccessfully();
            homePage.clickOnHomeButton();
            //click on "Customer Login" Tab
            customerLoginPage.clickOnCustomerLogin();
            //search customer that you created.
            homePage.setYourName("Prime Testing");
            //click on "Login" Button
            homePage.clickOnLogin();
            //verify "Logout" Tab displayed.
            //click on logout
            verifyText(driver, By.xpath("//button[normalize-space()='Logout']"),"Logout");
            homePage.clickOnLogout();
            //verify "Your Name" text displayed.
            verifyText(driver, By.xpath("//label[normalize-space()='Your Name :']"),"Your Name");
    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
            customerShouldLoginAndLogoutSuccessfully();
            homePage.clickOnHomeButton();
            //click on "Customer Login" Tab
            customerLoginPage.clickOnCustomerLogin();
            //search customer that you created.
            homePage.setYourName("Prime Testing");
            //click on "Login" Button
            homePage.clickOnLogin();
            //click on "Deposit" Tab
            accountPage.clickOnDeposite();
            //Enter amount 100
            accountPage.setDeposit();
            //click on "Deposit" Button
            accountPage.clickOnDeposite1();
           //verify message "Deposit Successful"
           verifyText(driver, By.xpath("//span[@class='error ng-binding']"),"Deposit Successful");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){

        customerShouldDepositMoneySuccessfully();
        homePage.clickOnHomeButton();
     // click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();
     //  search customer that you created.
        homePage.setYourName("Prime Testing");
     //  click on "Login" Button
        homePage.clickOnLogin();
     //  click on "Withdrawl" Tab
        accountPage.clickOnWithdrawl();
     //  Enter amount 50
        accountPage.setDeposit1();
     // click on "withdraw" Button
        accountPage.clickOnWithdraw();
     //  verify message "Transaction Successful"
        verifyText(driver,By.xpath("//span[@class='error ng-binding']"),"Transaction successful");
    }
}
