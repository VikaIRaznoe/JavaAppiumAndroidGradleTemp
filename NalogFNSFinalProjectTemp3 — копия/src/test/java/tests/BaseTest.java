package tests;

import general.DriverManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {
    // private File app = new File("src/test/resources/apps/com.lolo.io.onelist_12.apk");

    //    @BeforeClass
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","8.0");
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability("appPackage","rs.oplatagosuslug.nalogi");
        caps.setCapability("appActivity","rs.oplatagosuslug.nalogi.MainActivity");
        caps.setCapability("app","/Users/viktoria/IdeaProjects/Java/NalogFNSFinalProjectTemp3/src/test/resources/App/app-debug.apk");
//        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        URL appiumURL = new URL("http://127.0.0.1:4723/wd/hub");
        DriverManager.initializeDriver(appiumURL, caps);
    }
    //    @AfterClass
    @AfterMethod
    public void  tearDown() {
        DriverManager.getDriver().quit();
    }
}