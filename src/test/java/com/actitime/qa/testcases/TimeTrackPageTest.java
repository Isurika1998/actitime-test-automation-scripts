//package com.actitime.qa.testcases;
//
//import com.actitime.qa.base.TestBase;
//import com.actitime.qa.pages.HomePage;
//import com.actitime.qa.pages.LoginPage;
//import com.actitime.qa.pages.TimeTrackPage;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class TimeTrackPageTest extends TestBase {
//
//    LoginPage loginPage;
//    HomePage homePage;
//
//    TimeTrackPage timeTrackPage;
//
//    public TimeTrackPageTest() {
//
//        super();
//    }
//
//    @BeforeMethod
//    public void setup() {
//        initialization();
//        loginPage = new LoginPage();
//        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
//        timeTrackPage = homePage.clickOnTimeTrackLink();
//    }
//
//    @Test(priority = 1)
//    public void usersPageAttendanceTest() {
//
//        boolean flag = timeTrackPage.validateAttendanceTable();
//        Assert.assertTrue(flag, "Cannot find the attendance table");
//    }
//
//    @AfterMethod
//    public void tearDown() {
//
//        driver.quit();
//    }
//}
