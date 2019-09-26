package Common;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hooks extends CommonMembers {
		
	
		public static void AppiumCapabilities()
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
			cap.setCapability(MobileCapabilityType.UDID, "RZ8M520WVJY");		
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			cap.setCapability(MobileCapabilityType.APP, "/Users/nandini/Documents/Apk/Pregnancy_debug.apk");
			cap.setCapability("appPackage", "com.hp.pregnancy.lite");
			cap.setCapability("appActivity", "com.hp.pregnancy.lite.onboarding.SplashScreenActivity");
			//cap.setCapability("default", "true");
			cap.setCapability("noReset", "true" );
			try {
				driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
				//driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
				Wait();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}

		}
		public static void Wait()
		{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			

		}
		
		public static void Dispose() {
			driver.quit();

		}
}
