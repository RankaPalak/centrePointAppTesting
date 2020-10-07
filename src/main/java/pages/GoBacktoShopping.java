package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import locators.ElementLocators;

public class GoBacktoShopping extends ElementLocators{
	AndroidDriver driver;

	public GoBacktoShopping(AndroidDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	public AndroidDriver GoBackToCart() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GoToBasketXPath))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RemoveQuantityXPath))).isEnabled();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RemoveQuantityXPath))).click();
		return  driver;
	}

	public AndroidDriver GoToShopping() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(StartShoppingButtonXPath))).click();
		return  driver;
	}
}
