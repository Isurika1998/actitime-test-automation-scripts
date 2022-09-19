package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    UsersPage usersPage;

    public UserPageTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        usersPage = homePage.clickOnUsersLink();
    }

    @Test(priority = 1)
    public void usersPageLogoTest() {

        boolean flag = homePage.validateActiTimeLogo();
        Assert.assertTrue(flag, "Cannot find the Logo");
    }

    @Test(priority = 2)
    public void usersPageProfileViewTest() {

        boolean flag = usersPage.validateViewEmployeeProfiles();
        Assert.assertTrue(flag, "Cannot view user profiles");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
