package centrePointAppTesting;
 
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


 
public class CentrePointApp {
 private static AndroidDriver driver;
 
	
	@Before
	public void setU() throws MalformedURLException
	
	{
		File appDir = new File("src");
		File app = new File(appDir, "centrepointstores.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName", "192.168.0.187:5555");
		capabilities.setCapability("platformVersion", "10.0");
		capabilities.setCapability("platformName", "Android");	
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability("appActivity", "com.landmarkgroupreactapps.MainActivity");
		capabilities.setCapability("appWaitActivity", "com.landmarkgroupreactapps.MainActivity");
		
			this.driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub")  , capabilities);
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}


	@Test
	public void Logn() throws MalformedURLException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.landmarkgroup.centrepointstores:id/action_bar_root")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"btnContinue, \"]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"btnStartShopping, \"]"))).click();		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"btnContinue, \"]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.view.ViewGroup[@content-desc=\"toMenuItem, \"])[1]/android.widget.TextView"))).isEnabled();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.view.ViewGroup[@content-desc=\"toMenuItem, \"])[1]/android.widget.TextView"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.view.ViewGroup[@content-desc=\"toListItemcategory, \"])[6]"))).isEnabled();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.view.ViewGroup[@content-desc=\"toListItemcategory, \"])[6]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.ViewGroup[@content-desc=\"toListItemcategory, \"])[1]"))).click();
		String disp_price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.TextView[@content-desc=\"txtPrice, \"])[1]"))).getText();
		String disp_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.TextView[@content-desc=\"txtProductTitle, \"])[1]"))).getText();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.ViewGroup[@content-desc=\"imgundefined, \"])[1]/android.view.ViewGroup/android.widget.ImageView"))).click();
		String actual_price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"txtPrice, \"]"))).getText();
		Assert.assertEquals(disp_price, actual_price);
		String actual_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"txtProductTitle, \"]"))).getText();		
		Assert.assertEquals(disp_name, actual_name);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"ttlAddToBasketButton, \"]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"btnCheckoutNow, \"]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"viwPicker, \"]/android.widget.Spinner"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"ttlProceedToCheckoutButton, \"]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"testIdIcon, \"]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"ttlRemoveButton, \"]"))).isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc=\"ttlRemoveButton, \"]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"btnStartShoppingButton, \"]"))).click();
		 
	}
 

 
}