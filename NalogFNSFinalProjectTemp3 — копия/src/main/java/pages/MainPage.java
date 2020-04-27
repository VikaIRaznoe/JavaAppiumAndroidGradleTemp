package pages;

import org.openqa.selenium.By;
import static general.GeneralMethods.waitForElementPresentRefact;

public class MainPage {

    //Меню (слева,вверху)
    //Раздел "Оплата налогов"
    By elementMenu = By.xpath("//android.widget.Button[@content-desc=\"menu dark \"]");

    public void openMenu(){
        waitForElementPresentRefact(elementMenu,50).click();
    }

 }
