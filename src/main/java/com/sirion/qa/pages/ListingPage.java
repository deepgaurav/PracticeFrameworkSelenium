package com.sirion.qa.pages;

import com.sirion.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage extends TestBase{


        //Page Factory or OR


        @FindBy(xpath = "//div[@id='desktop-headerMount']//header[@id='desktop-header-cnt']//div[@class='desktop-bound']//div[@class='desktop-navLinks']//div[@class='desktop-navContent']//div[@class='desktop-navLink']//a[@href='/shop/men']")
        WebElement MenCategory;

        @FindBy(xpath = "//div[@class='desktop-navLinks']//div[1]//div[1]//div[1]//div[1]//div[1]//li[1]//ul[1]//li[2]//a[1]")
        WebElement MenSubCategory;


        //Intializing the page Object
        public ListingPage(){

            PageFactory.initElements(driver, this);
        }


        //Actions

        public void Redirectiontolistingpage() {
            MenCategory.click();
           /* Actions action = new Actions(driver);
            action.moveToElement(MenSubCategory).click().perform();
*/
        }



        }






