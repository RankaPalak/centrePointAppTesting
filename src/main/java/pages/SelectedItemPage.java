package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import locators.ElementLocators;

public class SelectedItemPage extends ElementLocators{
	AndroidDriver driver;
	String detail_price, detail_title, price, title;

	public SelectedItemPage(AndroidDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	public Object[] informationItem() throws InterruptedException
	{
		Object[] itemHandler = new Object[3];
		WebDriverWait wait = new WebDriverWait(driver, 10);
		detail_price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GetDetailPriceXPath))).getText();
		detail_title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GetDetailTitleXPath))).getText();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AddToBasketXPath))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CheckoutButtonXPath))).click();
		itemHandler[0] = driver;
		itemHandler[1] = detail_price;
		itemHandler[2] = detail_title;
		return  itemHandler;
	}

}
