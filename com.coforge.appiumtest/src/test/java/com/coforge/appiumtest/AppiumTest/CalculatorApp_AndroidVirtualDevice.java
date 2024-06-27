package com.coforge.appiumtest.AppiumTest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorApp_AndroidVirtualDevice {
    
    
    
	@Test
    public void verifyAddTest() throws Exception {
        
        
        
        
        
        
        //adb devices
        //appserver
        
        
        
        AppiumDriver<MobileElement> driver;

        String appiumServer = "http://127.0.0.1:4723/wd/hub";


        //Device
                DesiredCapabilities cap = new DesiredCapabilities();
                
                cap.setCapability("udid", "emulator-5554");                         //adb 
                cap.setCapability("platformName", "Android");
                
                //cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                
                
                cap.setCapability("platformVersion", "34.0");
                

//      //app2
//              //adb shell dumpsys window | find "mCurrentFocus"
//              
             cap.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
           cap.setCapability("appActivity", "com.google.android.apps.nexuslauncher.NexusLauncherActivity");
                

        driver = new AppiumDriver<MobileElement>(new URL(appiumServer), cap);
        
        
        
        
        
        
        
        
        
    }
    
    

}




 