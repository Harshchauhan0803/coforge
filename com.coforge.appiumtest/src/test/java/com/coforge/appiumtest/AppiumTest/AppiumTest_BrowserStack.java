package com.coforge.appiumtest.AppiumTest;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest_BrowserStack {

	WebDriver driver;
    public static final String USERNAME = "himanshutayal_7ne4up";
    public static final String AUTOMATE_KEY = "xYqqVXxXEETGJqtpUZzZ";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    
	
    @BeforeMethod
    public void setUp() throws Exception {
		String browserName = "chrome";
        String os = "chrome";
        String os_version = "chrome";
        String browser_version = "chrome";
        
        System.out.println("browser name is : " + browserName);
        //String methodName = name.getName();
        
        DesiredCapabilities caps = new DesiredCapabilities();
        
//      caps.setCapability("os", os);
//      caps.setCapability("os_version", os_version);
//      caps.setCapability("browser_version", browser_version);
        
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 3a");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
//        curl -u "himanshutayal_7ne4up:xYqqVXxXEETGJqtpUZzZ"  -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Training\Downloads\ApiDemos-debug.apk"
        caps.setCapability("build", "chrome browser script");
        caps.setCapability("name", "Coforge ----- Run chrome on device - NOP comm Test on cloud");

        driver = new RemoteWebDriver(new URL(URL), caps);
	}
    @Test
	public void verifyAddTest() throws Exception {
    	Thread.sleep(3000);
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("input#Email")).clear();
        driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
        
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("admin");
        
        driver.findElement(By.cssSelector("input#RememberMe")).click();
        
        driver.findElement(By.tagName("button")).click();
        
        Thread.sleep(5000);
    }
}
