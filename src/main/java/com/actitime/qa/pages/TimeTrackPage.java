//package com.actitime.qa.pages;
//
//import com.actitime.qa.base.TestBase;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class TimeTrackPage extends TestBase {
//
//    //Page Factory - Object Repository
//
//    @FindBy(xpath = "//table[@id='tt-table']")
//    WebElement tt_Table;
//
//    public TimeTrackPage() {
//
//        PageFactory.initElements(driver, this);
//    }
//
//    //Action/Methods
//
//    public Boolean validateAttendanceTable() {
//
//        return tt_Table.isDisplayed();
//    }
//}
