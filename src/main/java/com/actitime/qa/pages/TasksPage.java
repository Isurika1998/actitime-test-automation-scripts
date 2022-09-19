package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends TestBase {

    public TasksPage() {

        PageFactory.initElements(driver, this);
    }
	
	
}
