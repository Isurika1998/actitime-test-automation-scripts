package com.actitime.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
    }

    @Test(priority = 1)
    public void homePageLogoTest() {

        boolean flag = homePage.validateActiTimeLogo();
        Assert.assertTrue(flag, "Cannot find the Logo");
    }

    @Test(priority = 1)
    public void usersPageAttendanceTest() {

        boolean flag = homePage.validateAttendanceTable();
        Assert.assertTrue(flag, "Cannot find the attendance table");
    }

    @Test(priority = 2)
    public void homePageTaskLinkTest() {

        homePage.clickOnTaskLink();
    }

    @Test(priority = 2)
    public void homePageReportsLinkTest() {

        homePage.clickOnReportsLink();
    }

    @Test(priority = 2)
    public void homePageUsersLinkTest() {

        homePage.clickOnUsersLink();
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

}
