package com.sirion.qa.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.sirion.qa.base.TestBase;
import com.sirion.qa.pages.ListingPage;
import com.sirion.qa.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListingPageTest extends TestBase {

        public static Logger log = LogManager.getLogger(TestBase.class.getName());
        public ListingPage listingpage;
        ExtentReports extrep;



        public ListingPageTest(){
            super();

        }

        @BeforeTest
        public void setup(){
            intialization();
            listingpage = new ListingPage();
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
        public void OpenListingPage(){
            listingpage.Redirectiontolistingpage();



        }

        @AfterTest

        public void TearDown(){

            driver.quit();
        }
    }


