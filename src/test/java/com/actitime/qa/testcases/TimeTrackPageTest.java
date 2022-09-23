package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.TimeTrackPage;
import com.actitime.qa.pages.UsersPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeTrackPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    UsersPage usersPage;

    TimeTrackPage timeTrackPage;

    public TimeTrackPageTest() {

        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        usersPage = homePage.clickOnUsersLink();
        timeTrackPage = usersPage.clickOnTimeTrackLink();
    }

    /**
     * Testcase: View records of employee attendance and leaves.
     */
    @Test(priority = 1)
    public void leaveAttendanceRecordsTest(){

        boolean flag = timeTrackPage.validateEmployeeLeaveAndAttendance();
        Assert.assertTrue(flag);
    }

    /**
     * Testcase: Approve employee time-track.
     */
    @Test(priority = 8)
    public void approvalProcessTest(){
        boolean flag = timeTrackPage.validateApproveProcess();
        if(flag){
            Assert.assertTrue(flag);
        }else{
            Assert.assertFalse(flag);
        }

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
