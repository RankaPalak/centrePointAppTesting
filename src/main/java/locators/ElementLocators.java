package locators;

public class ElementLocators {
    protected static final String ContinueButtonXPath = "//android.view.ViewGroup[@content-desc=\"btnContinue, \"]" ;
	protected static final String StartShoppingXPath = "//android.view.ViewGroup[@content-desc=\"btnStartShopping, \"]";
	protected static final String SelectDepartmentXPath = "(//android.view.ViewGroup[@content-desc=\"toMenuItem, \"])[1]/android.widget.TextView";
	protected static final String SelectMenuXPath = "(//android.view.ViewGroup[@content-desc=\"toListItemcategory, \"])[6]";
	protected static final String SelectSubmenuXPath = "(//android.view.ViewGroup[@content-desc=\"toListItemcategory, \"])[1]";
	protected static final String GetDisplayPriceXPath = "(//android.widget.TextView[@content-desc=\"txtPrice, \"])[1]";
	protected static final String GetDisplayTitleXPath = "(//android.widget.TextView[@content-desc=\"txtProductTitle, \"])[1]";
	protected static final String ClickToGetDetailsXPath = "(//android.view.ViewGroup[@content-desc=\"imgundefined, \"])[1]/android.view.ViewGroup/android.widget.ImageView";
	protected static final String GetDetailPriceXPath = "//android.widget.TextView[@content-desc=\"txtPrice, \"]";
	protected static final String GetDetailTitleXPath = "//android.widget.TextView[@content-desc=\"txtProductTitle, \"]";
	protected static final String AddToBasketXPath = "//android.widget.TextView[@content-desc=\"ttlAddToBasketButton, \"]";
	protected static final String CheckoutButtonXPath = "//android.view.ViewGroup[@content-desc=\"btnCheckoutNow, \"]";
	protected static final String QuantityDropdownXPath = "//android.view.ViewGroup[@content-desc=\"viwPicker, \"]/android.widget.Spinner";
	protected static final String QuantityValueXPath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]";
	protected static final String ProceedToCheckoutXPath = "//android.widget.TextView[@content-desc=\"ttlProceedToCheckoutButton, \"]";
	protected static final String GoToBasketXPath = "//android.widget.TextView[@content-desc=\"testIdIcon, \"]";
	protected static final String RemoveQuantityXPath = "//android.widget.TextView[@content-desc=\"ttlRemoveButton, \"]";
	protected static final String StartShoppingButtonXPath = "//android.view.ViewGroup[@content-desc=\"btnStartShoppingButton, \"]";
	 
}
