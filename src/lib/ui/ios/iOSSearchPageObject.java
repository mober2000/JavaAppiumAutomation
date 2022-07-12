package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;

public class iOSSearchPageObject extends SearchPageObject
{
    static {
        //SEARCH_INIT_ELEMENT = "xpath://XCUIElementTypeSearchField[@name='Поиск по Википедии']";
        SEARCH_INPUT = "id:Поиск по Википедии";
        SEARCH_CANCEL_BUTTON = "xpath://XCUIElementTypeStaticText[@name='Отменить']";
        /*Возможно придется исправить*/
        SEARCH_RESULT_SUBSTRING_TPL = "xpath://XCUIElementTypeApplication[@name='Википедия']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther[2]";
        /*Разобраться, нужен ли этот элемент*/
        SEARCH_RESULT_ELEMENT = "xpath://*[@resource-id='org.wikipedia:id/search_results_list']/*[@resource-id='org.wikipedia:id/page_list_item_container']";
        SEARCH_EMPTY_RESULT_ELEMENT = "id:Ничего не найдено";
    }

    public iOSSearchPageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
