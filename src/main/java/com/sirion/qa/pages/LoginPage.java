package com.sirion.qa.pages;

import com.sirion.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Page Factory or OR

    @FindBy(name="username_login")
    WebElement UserName;

    @FindBy(name="password_login")
    WebElement Password;

    @FindBy(id = "loginButton")
    WebElement Submit;

    @FindBy(xpath = "//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")
    WebElement profile;

    @FindBy(xpath = "//a[@class='desktop-linkButton']")
    WebElement Signin;

    @FindBy(className = "myntraweb-sprite desktop-logo sprites-headerLogo")
    WebElement Logo;

    @FindBy(xpath = "//input[@class='form-control mobileNumberInput']")
    WebElement phonenumber;

    @FindBy(xpath = "//div[@class='submitBottomOption']")
    WebElement ContinueButton;

    @FindBy(xpath="//div[@class='bottomeLink']//span[contains(text(),' Password')]")
    WebElement loginthroughpassword;

    @FindBy(id="mobileNumberPass")
    WebElement entermail;
    @FindBy(xpath="//input[@class='form-control has-feedback']")
    WebElement paswordagain;
    @FindBy(xpath="//button[contains(@class,'lg block submitButton')]")
    WebElement continueagain;
  //Intializing the page Object
    public LoginPage(){

        PageFactory.initElements(driver, this);
    }


    //Actions

    public String validateLoginPageTitle(){
      return driver.getTitle();

    }


    public HomePage validateLoginFunctionality(){

       profile.click();
        Actions action = new Actions(driver);
        action.moveToElement(Signin).click().perform();
        phonenumber.sendKeys("9958525806");
        ContinueButton.click();
        loginthroughpassword.click();
        entermail.clear();
        entermail.sendKeys("0109shipra@gmail.com");
        paswordagain.sendKeys("Work@1234");
        continueagain.click();



      return new HomePage();

    }



}
