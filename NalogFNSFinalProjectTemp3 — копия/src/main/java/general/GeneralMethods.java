package general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GeneralMethods extends DriverManager{


    private static String screenshotPathExpected = "src/test/resources/App_Screenshot/expectedScreenshot/";
    private static String screenshotPathActual = "src/test/resources/App_Screenshot/actualScreenshot/";

    public static WebElement elementMainMenuHelpPage = DriverManager.getDriver().findElementByXPath("//android.webkit.WebView[@content-desc=\"Помощь\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]");


    //Метод ожидания появления элемента
    public static WebElement waitForElementPresentRefact(By by, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),  timeoutInSeconds);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by) //ожидает элемент
        );
    }
}