package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends TestBase  {

    //Page Factory - Object Repository

    @FindBy(xpath = "//table[@class='userListTable userList_workAssignmentsTable canEditUsers']")
    WebElement userTable;

    @FindBy(xpath = "//div[@class='userNameContent clickable']")
    WebElement userNameContent;

    @FindBy(xpath = "//div[@class='edit_user_sliding_panel sliding_panel components_panelContainer']")
    WebElement userInfoPanel;

    @FindBy(xpath = "//a[@class='content tt']")
    WebElement timeTrackLink;

    @FindBy(xpath = "//div[@id='logo_aT']")
    WebElement actitimeLogo;

    public UsersPage() {

        PageFactory.initElements(driver, this);
    }

    public Boolean validateActiTimeLogo() {

        return actitimeLogo.isDisplayed();
    }

    public Boolean validateViewEmployeeProfiles() {

            userNameContent.click();
            return userInfoPanel.isDisplayed();
    }

    public TimeTrackPage clickOnTimeTrackLink() {
        timeTrackLink.click();
        return new TimeTrackPage();
    }

}
