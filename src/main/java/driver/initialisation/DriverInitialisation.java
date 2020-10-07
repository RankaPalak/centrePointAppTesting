package driver.initialisation;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import readDesiredCapabilities.readDesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverInitialisation {

	private static AndroidDriver driver;

	public static AndroidDriver launchApp() throws IOException

	{

		readDesiredCapabilities properties = new readDesiredCapabilities();
		HashMap<String, String> dictionary =properties.getPropValues();
		DesiredCapabilities capabilities= new DesiredCapabilities();

		File appDir = new File(dictionary.get("FILE_DIR"));
		File app = new File(appDir, dictionary.get("APK_NAME"));

		capabilities.setCapability("deviceName", dictionary.get("DEVICE_NAME"));
		capabilities.setCapability("platformVersion", dictionary.get("PLATFORM_VERSION"));
		capabilities.setCapability("platformName", dictionary.get("PLATFORM_NAME"));	
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,dictionary.get("AUTOMATION_NAME"));
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability("appActivity", dictionary.get("APP_ACTIVITY"));
		capabilities.setCapability("appWaitActivity", dictionary.get("WAIT_ACTIVITY"));

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub")  , capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		return driver;
	}

}
