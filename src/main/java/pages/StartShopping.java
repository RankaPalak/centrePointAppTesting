package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import locators.ElementLocators;

public class StartShopping extends ElementLocators{
	AndroidDriver driver;

	public StartShopping(AndroidDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	public AndroidDriver StartButton() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		if(driver.findElement(By.xpath(ContinueButtonXPath)) != null)
			driver.findElement(By.xpath(ContinueButtonXPath)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(StartShoppingXPath))).click();
		return  driver;
	}

}
