package lib.ui;

import io.appium.java_client.AppiumDriver;

public class WelcomePageObject extends MainPageObject
{
    private static final String
    STEP_MORE_LEARN_LINK = "id:Узнать подробнее о Википедии",
    STEP_FOR_NEW_WAY_TO_EXPLORE_TEXT = "id:Новые способы изучения",
    STEP_FOR_ADD_OR_EDIT_PREFERRED_LANG_TEXT = "id:Добавить или изменить предпочтительные языки",
    STEP_FOR_LEARN_MORE_ABOUT_DATA_COLLECTED_TEXT = "id:Узнать подробнее о сборе данных",
    STEP_CLICK_NEXT_BUTTON = "id:Далее",
    STEP_GET_STARTED_BUTTON = "id:Начать",
    SKIP = "xpath://XCUIElementTypeButton[@name='Пропустить']";
    //SKIP = "id:Пропустить";

    public WelcomePageObject(AppiumDriver driver)
    {
        super(driver);
    }

    public void waitForLearnMoreLink()
    {
        this.waitForElementPresent(STEP_MORE_LEARN_LINK, "Cannot find 'Узнать подробнее о Википедии' link", 10);
    }

    public void waitForNewWayToExploreText()
    {
        this.waitForElementPresent(STEP_FOR_NEW_WAY_TO_EXPLORE_TEXT, "Cannot find 'Новые способы изучения' link", 10);
    }

    public void waitForAddOrEditPreferredLangText()
    {
        this.waitForElementPresent(STEP_FOR_ADD_OR_EDIT_PREFERRED_LANG_TEXT, "Cannot find 'Добавить или изменить предпочтительные языки' link", 10);
    }

    public void waitForLearnMoreAboutDataCollectedText()
    {
        this.waitForElementPresent(STEP_FOR_LEARN_MORE_ABOUT_DATA_COLLECTED_TEXT, "Cannot find 'Узнать подробнее о сборе данных' link", 10);
    }

    public void clickNextButton()
    {
        this.waitForElementAndClick(STEP_CLICK_NEXT_BUTTON, "Cannot find and click 'Next' link", 10);
    }

    public void clickGetStartedButton()
    {
        this.waitForElementAndClick(STEP_GET_STARTED_BUTTON, "Cannot find and click 'Начать' link", 10);
    }

    public void clickSkip()
    {
        this.waitForElementAndClick(SKIP, "Cannot find and click skip button", 5);
    }
}
