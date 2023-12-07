import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyRosKids{
    AndroidDriver driver;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Email\"]")).sendKeys("qa@appdesign.ie");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Password\"]")).sendKeys("123456");
        driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Book A Service\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"(Close On Thu 30th November @7AM)\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Select your child\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Done\"]")).click();







    }
    @AfterAll
    void teardown(){

    }
}