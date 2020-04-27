package tests;

import general.GeneralMethods;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pages.MainPage;

public class FirstTest extends BaseTest {

    @Test(enabled = true)
    public void openMenuTest(){
        MainPage mainPage = new MainPage();
        mainPage.openMenu();
    }
 }
