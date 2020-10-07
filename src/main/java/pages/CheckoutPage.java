package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import locators.ElementLocators;

public class CheckoutPage extends ElementLocators{
	AndroidDriver driver;

	public CheckoutPage(AndroidDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	public AndroidDriver CheckoutItem() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(QuantityDropdownXPath))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(QuantityValueXPath))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ProceedToCheckoutXPath))).click();
		return  driver;
	}

}
