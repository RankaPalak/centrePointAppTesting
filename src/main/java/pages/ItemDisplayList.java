package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import locators.ElementLocators;

public class ItemDisplayList extends ElementLocators{
	AndroidDriver driver;
	String disp_price, disp_title;

	public ItemDisplayList(AndroidDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	public Object[] displayItem() throws InterruptedException
	{
		Object[] itemHandler = new Object[3];
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		disp_price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GetDisplayPriceXPath))).getText();
		disp_title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GetDisplayTitleXPath))).getText();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ClickToGetDetailsXPath))).click();
		itemHandler[0] = driver;
		itemHandler[1] = disp_price;
		itemHandler[2] = disp_title;
		return  itemHandler;
	}

}
