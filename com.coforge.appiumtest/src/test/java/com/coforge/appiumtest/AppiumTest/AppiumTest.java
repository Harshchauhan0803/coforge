package com.coforge.appiumtest.AppiumTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest {

	@Test
	public void verifyAddTest() throws Exception {

		AppiumDriver<MobileElement> driver;

		String appiumServer = "http://localhost:4723/wd/hub";

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("udid", "emulator-5554"); // adb

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

		cap.setCapability("platformVersion", "34.0");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MOBILE__DEVICE__NAME");
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		
		//install application
		cap.setCapability(MobileCapabilityType.APP, "PATH WHERE APP IS LOCATED");
		
		//to check appPackage and appActivity
		//adb shell dumpsys window | find "mCurrentFocus" 
		
		cap.setCapability("appPackage", "com.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator.Calculator"); 

		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), cap);
		

	}

}
