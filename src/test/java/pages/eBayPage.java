package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class eBayPage {
static AndroidDriver<AndroidElement> driver;
static By cross=MobileBy.xpath("//android.widget.ImageView[@content-desc='Close']");
static By selling=MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.Button[1]");
static By deal=MobileBy.xpath("//android.widget.Button[@text='Deals']");
static By fashion=MobileBy.xpath("//android.widget.TextView[@text='Fashion']");
static By search=MobileBy.id("com.ebay.mobile:id/search_box");
static By search_text=MobileBy.id("com.ebay.mobile:id/search_src_text");
static By searchelementclicked=MobileBy.xpath("//android.widget.RelativeLayout[1]/android.widget.TextView");
static By modal=MobileBy.id("com.ebay.mobile:id/text_slot_1");
static By sort=MobileBy.id("com.ebay.mobile:id/button_sort");
static By sort_option=MobileBy.xpath("//android.widget.RadioButton[@content-desc='Price + Shipping: lowest first']");
static By sortFirst=MobileBy.id("com.ebay.mobile:id/button_sort");
static By sort_option_First=MobileBy.xpath("//android.widget.RadioButton[@content-desc='Price + Shipping: highest first']");
static By sortSecond=MobileBy.id("com.ebay.mobile:id/button_sort");
static By sort_option_second=MobileBy.xpath("//android.widget.RadioButton[@content-desc='Time: newly listed']");
static By sortThird=MobileBy.id("com.ebay.mobile:id/button_sort");
static By sort_option_third=MobileBy.xpath("//android.widget.RadioButton[@content-desc='Time: ending soonest']");
static By sortFourth=MobileBy.id("com.ebay.mobile:id/button_sort");
static By sort_option_fourth=MobileBy.xpath("//android.widget.RadioButton[@content-desc='Distance: nearest first']");
static By filter=MobileBy.id("com.ebay.mobile:id/button_filter");
static By filter_condition=MobileBy.xpath("//android.widget.TextView[@text='Condition']");
static By filter_condition_option=MobileBy.xpath("//android.widget.TextView[@text='New']");
static By filter_condition_button=MobileBy.id("com.ebay.mobile:id/call_to_action_button");
static By dealOne=MobileBy.xpath("//android.widget.Button[@text='Deals']");
static By feature_deals=MobileBy.xpath("//android.widget.TextView[@content-desc='Featured Deals,7 items']");
static By hamburgermenu=MobileBy.xpath("//android.widget.ImageButton[@content-desc='Main navigation, open']");
static By hamburger_sellings=MobileBy.id("com.ebay.mobile:id/nav_selling");
static By hamburgermenuOne=MobileBy.xpath("//android.widget.ImageButton[@content-desc='Main navigation, open']");
static By hamburger_categories=MobileBy.id("com.ebay.mobile:id/nav_categories");
static By categories_baby=MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.ImageView");
static By categories_baby_back_arrow=MobileBy.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
static By hamburgermenuSecond=MobileBy.xpath("//android.widget.ImageButton[@content-desc='Main navigation, open']");
static By hamburger_deals=MobileBy.id("com.ebay.mobile:id/nav_deals");

	public eBayPage(AndroidDriver<AndroidElement>  driver) {
		eBayPage.driver = driver;
}
	public static void setcross(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement crosselement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(cross));
	    crosselement.click();
	    Thread.sleep(4000);
	    }
	public static void setselling(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sellingelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(selling));
	    sellingelement.click();
	    Thread.sleep(4000);
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    Thread.sleep(4000);
	    }
	public static void setdeal(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement dealelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(deal));
	    dealelement.click();
	    Thread.sleep(4000);
	    }
	public static void setfashion(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement fashionelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(fashion));
	    fashionelement.click();
	    Thread.sleep(4000);
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    Thread.sleep(4000);
	    }
	public static void setsearch(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement searchelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(search));
	    searchelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsearch_text(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement search_textelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(search_text));
	    search_textelement.sendKeys("Cars");
	    Thread.sleep(4000);
	    }
	public static void setsearchelementclicked(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement searchelementclickedelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(searchelementclicked));
	    searchelementclickedelement.click();
	    Thread.sleep(4000);
	    }
	public static void setmodal(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement modalelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(modal));
	    modalelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsort(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sortelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sort));
	    sortelement.click();
	    Thread.sleep(4000);
	    }
    public static void setsort_option(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sort_optionelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sort_option));
	    sort_optionelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsortFirst(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sortFirstelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sortFirst));
	    sortFirstelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsort_option_First(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sort_option_Firstelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sort_option_First));
	    sort_option_Firstelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsortSecond(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sortSecondelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sortSecond));
	    sortSecondelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsort_option_second(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sort_option_secondelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sort_option_second));
	    sort_option_secondelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsortThird(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sortThirdelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sortThird));
	    sortThirdelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsort_option_Third(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sort_option_Thirdelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sort_option_third));
	    sort_option_Thirdelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsortFourth(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sortFourthelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sortFourth));
	    sortFourthelement.click();
	    Thread.sleep(4000);
	    }
	public static void setsort_option_fourth(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement sort_option_fourthelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(sort_option_fourth));
	    sort_option_fourthelement.click();
	    Thread.sleep(4000);
	    }
	public static void setFilter(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Filterelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(filter));
	    Filterelement.click();
	    Thread.sleep(4000);
	    }
	public static void setFilter_Condition(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Filter_Conditionelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(filter_condition));
	    Filter_Conditionelement.click();
	    Thread.sleep(4000);
	    }
	public static void setFilter_Condition_Option(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Filter_Condition_Optionelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(filter_condition_option));
	    Filter_Condition_Optionelement.click();
	    Thread.sleep(4000);
	    }
	public static void setFilter_Condition_Button(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Filter_Condition_Buttonelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(filter_condition_button));
	    Filter_Condition_Buttonelement.click();
	    Thread.sleep(4000);
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    }
	public static void setDealOne(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement DealOneelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(dealOne));
	    DealOneelement.click();
	    Thread.sleep(4000);
	    }
	public static void setFeature_Deals(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Feature_Dealselement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(feature_deals));
	    Feature_Dealselement.click();
	    Thread.sleep(4000);
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    }
	public static void setHamburgerMenu(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Hamburgermenuelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(hamburgermenu));
	    Hamburgermenuelement.click();
	    Thread.sleep(4000);
	    }
	public static void setHamburger_Sellings(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Hamburger_Sellingselement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(hamburger_sellings));
	    Hamburger_Sellingselement.click();
	    Thread.sleep(4000);
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    }
	public static void setHamburgermenuone(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Hamburgermenuoneelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(hamburgermenuOne));
	    Hamburgermenuoneelement.click();
	    Thread.sleep(4000);
	    }
	public static void setHamburger_Categories(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Hamburger_Categorieselement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(hamburger_categories));
	    Hamburger_Categorieselement.click();
	    Thread.sleep(4000);
	    }
	public static void setCategories_Baby(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Categories_Babyelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(categories_baby));
	    Categories_Babyelement.click();
	    Thread.sleep(4000);
	    }
	public static void setCategories_Baby_Back_Arrow(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Categories_Baby_Back_Arrowelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(categories_baby_back_arrow));
	    Categories_Baby_Back_Arrowelement.click();
	    Thread.sleep(4000);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    }
	public static void setHamburgermenuSecond(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement HamburgermenuSecondelement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(hamburgermenuSecond));
	    HamburgermenuSecondelement.click();
	    Thread.sleep(4000);
	    }
	public static void setHamburger_Deals(AndroidDriver<AndroidElement> driver) throws InterruptedException {
	    AndroidElement Hamburger_Dealselement = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(hamburger_deals));
	    Hamburger_Dealselement.click();
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    Thread.sleep(4000);
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	    }
}
