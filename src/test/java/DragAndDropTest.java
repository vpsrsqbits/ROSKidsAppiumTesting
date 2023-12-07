import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DropDownTest {
    AndroidDriver driver;
    AndroidTouchAction action;

    @BeforeAll
    void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:platformVersion","12");
        caps.setCapability("appium:udid","RZ8N60SY7AE");
        caps.setCapability("appium:automationName","UiAutomator2");
        caps.setCapability("appium:appPackage","ie.myroskids");
        caps.setCapability("appium:appActivity","ie.myroskids.MainActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }
    @Test
    void test(){

//        AndroidElement views = (AndroidElement) driver.findElement(new AppiumBy.ByAccessibilityId(""));
    }
    @AfterAll
    void teardown(){}
}
