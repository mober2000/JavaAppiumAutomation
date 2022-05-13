package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NavigationUI extends MainPageObject{

    private static final String
            CLICK_MY_LISTS = "xpath://android.widget.FrameLayout[@content-desc='My lists']",
            PRESENT_ELEMENTS = "xpath://*[@text='Learning programming']";

    public NavigationUI(AppiumDriver driver)
    {
        super(driver);
    }

    public void clickMyLists()
        {
            this.waitForElementAndClick(
                    CLICK_MY_LISTS, "Cannot find navigation button to My list", 5
            );

            this.waitForElementPresent(
                    PRESENT_ELEMENTS, "Cannot find create folder", 15
            );


        }

}

