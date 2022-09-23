package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage extends TestBase {

    //Page Factory - Object Repository

    @FindBy(xpath = "//*[contains(text(),'View Time-Track')]")
    WebElement viewButton;

    @FindBy(xpath = "//div[@class='workingTime dl']")
    WebElement workingTimeText;

    @FindBy(xpath = "//div[@class='leaveTime dl']")
    WebElement leaveTimeText;

    @FindBy(xpath = "//*[contains(text(),'Approve Time-Track')]")
    WebElement approveTimeTrackButton;

    @FindBy(xpath = "//tr[@class='childRow notReady']/td[@class='selectionCell']/input")
    WebElement approveCheckBox;

    @FindBy(xpath = "//span[@id='approveButton']")
    WebElement approveButton;

    @FindBy(xpath = "//tr[@class='childRow operationWasApplied approved']/td[@class='statusCell']/span")
    WebElement statusText;

    public TimeTrackPage() {

        PageFactory.initElements(driver, this);
    }

    //Action/Methods

    public Boolean validateEmployeeLeaveAndAttendance(){
        viewButton.click();
        return (workingTimeText.isDisplayed() && leaveTimeText.isDisplayed());
    }

    public Boolean validateApproveProcess(){
        approveTimeTrackButton.click();
        approveCheckBox.click();
        approveButton.click();
        return statusText.getText() == "Approved";
    }
}
