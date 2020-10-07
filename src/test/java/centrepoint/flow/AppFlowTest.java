package centrepoint.flow;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.initialisation.DriverInitialisation;
import io.appium.java_client.android.AndroidDriver;
import pages.CheckoutPage;
import pages.CountrySelection;
import pages.GoBacktoShopping;
import pages.GoToHome;
import pages.ItemDisplayList;
import pages.SelectDepartment;
import pages.SelectMenu;
import pages.SelectSubmenu;
import pages.SelectedItemPage;
import pages.StartShopping;

public class AppFlowTest {
	AndroidDriver driver;
	Object[] itemDetailHandler;
	Object[] itemHandler;
	
	@BeforeTest
	public void launchApplication() throws IOException {
		driver = DriverInitialisation.launchApp();
		Reporter.log("Application Launched Succesfully");
	}
	
	@Test (priority=0)
	public void selectCountry() throws IOException, InterruptedException {
		CountrySelection countrySelection = new CountrySelection(driver);
		countrySelection.SelectCountry();
		Reporter.log("Selected Location Succesfully");
	}
		
	@Test (priority=1)
	public void startShopping() throws IOException, InterruptedException {
		StartShopping startSelection = new StartShopping(driver);
		startSelection.StartButton();
		Reporter.log("Clicked on Start on User guide Page");
	}
	
	@Test (priority=2)
	public void homePage() throws IOException, InterruptedException {
		GoToHome goToHome = new GoToHome(driver);
		goToHome.HomePage();
		Reporter.log("Clicked on continue to view Home Page");
	}
	@Test (priority=3)
	public void clickDepartment() throws IOException, InterruptedException {
		SelectDepartment clickOption = new SelectDepartment(driver);
		clickOption.ClickDepartment();
		Reporter.log("Clicked on Department Link Succesfully");
	}
	@Test (priority=4)
	public void clickMenuOption() throws IOException, InterruptedException {
		SelectMenu clickOption = new SelectMenu(driver);
		clickOption.SelectMenuOption();
		Reporter.log("Clicked on Home and Living option from Menu Succesfully");
	}
	@Test (priority=5)
	public void selectHomeFurniture() throws IOException, InterruptedException {
		SelectSubmenu selectFurniture = new SelectSubmenu(driver);
		selectFurniture.SelectSubMenu();
		Reporter.log("Clicked on Home Furniture option from Sub Menu Succesfully");
	}
	@Test (priority=6)
	public void itemInfoList() throws IOException, InterruptedException {
		ItemDisplayList itemDisplay = new ItemDisplayList(driver);
		itemHandler = itemDisplay.displayItem();
		driver = (AndroidDriver) itemHandler[0];
		Reporter.log("Logged Price and Title for the item and selected the item");
	}
	@Test (priority=7)
	public void selectedItem() throws IOException, InterruptedException {
		SelectedItemPage itemInfo = new SelectedItemPage(driver);
		itemDetailHandler = itemInfo.informationItem();
		driver = (AndroidDriver) itemDetailHandler[0];
		Assert.assertEquals(itemDetailHandler[1], itemHandler[1]);
		Assert.assertEquals(itemDetailHandler[2], itemHandler[2]);
		Reporter.log("Verfied Price and Title for the item and proceed to checkout");
	}
	
	@Test (priority=8)
	public void checkoutItems() throws IOException, InterruptedException {
		CheckoutPage itemCheckout = new CheckoutPage(driver);
		itemCheckout.CheckoutItem();
		Reporter.log("Added Quantity and clicked for checkout");
	}
	@Test (priority=9)
	public void goBackToShopping() throws IOException, InterruptedException {
		GoBacktoShopping backButton = new GoBacktoShopping(driver);
		backButton.GoBackToCart();
		Reporter.log("Closed checkout page and removed the item succesfully");
		backButton.GoToShopping();
		Reporter.log("Clicked on Continue Shopping and redirected to Home Page succesfully");
	}
	}


