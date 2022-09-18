package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends TestBase  {

    public UsersPage() {

        PageFactory.initElements(driver, this);
    }

}
