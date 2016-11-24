package net.training_bdd.Appium_Sample;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

/**
 * Created by Fernanda on 11/24/2016.
 */
public class CommonMethods {

    public static WebDriver StartWebDriver() throws Exception {

        //  Create object of DesiredCapabilities class and specify android plataform
        DesiredCapabilities capabilities = DesiredCapabilities.android();

        // Set the capability to execute test in chrome browser
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
        // Set the capability to execute test in android plataform
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        // Set the capability to execute test in the correct appium version
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.6.0");
        // Set the capability to execute test in a device named "Android" (any name will do)
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        // Set the capability to execute test in android version
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");

//        capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, "true");
//        capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");

        // Create object of URL class and specify the appium server address
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");

        // Create object of AndroidDriver class and pass the url and capabilities created
        return new AndroidDriver(serverAddress, capabilities);

    }
}
