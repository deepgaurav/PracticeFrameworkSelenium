package com.sirion.qa.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.sirion.qa.base.TestBase;
import com.sirion.qa.pages.HomePage;
import com.sirion.qa.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

public class LoginTest extends TestBase {
     //public WebDriver driver;
    public static Logger log = LogManager.getLogger(TestBase.class.getName());
     public LoginPage loginpage;
    ExtentReports extrep;


   public LoginTest(){
       super();

   }

    @BeforeTest
    public void setup(){
     intialization();
        loginpage = new LoginPage();
        log.info("Driver is initialized");
         String path = System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Myntra Automation Report");
        reporter.config().setDocumentTitle("Web Automation");

      extrep= new ExtentReports();
        extrep.attachReporter(reporter);
        extrep.setSystemInfo("Tester","Shipra");





    }

    @Test
    public void LoginPageTitle(){
       extrep.createTest("Login Test");
       log.info("Validating the Login Page title here");

       String Title = loginpage.validateLoginPageTitle();
        Assert.assertEquals(Title,"Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
        extrep.flush();

    }





    @Test
    public void SignInUsingemail(){
        loginpage.validateLoginFunctionality() ;
        System.out.println("Test");



    }

    @AfterTest

    public void TearDown(){

       driver.quit();
    }
}
