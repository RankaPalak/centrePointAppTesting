package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import locators.ElementLocators;

public class SelectMenu extends ElementLocators{
	AndroidDriver driver;

	public SelectMenu(AndroidDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	public AndroidDriver SelectMenuOption() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectMenuXPath))).click();
		return  driver;
	}

}
