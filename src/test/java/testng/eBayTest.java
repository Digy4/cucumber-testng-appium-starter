package testng;
import java.net.MalformedURLException;
import org.testng.annotations.Test;
import com.digy4.java.mobiletesting.Digy4AndroidAppTestNGSupport;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.eBayPage;

public class eBayTest {
	AndroidDriver<AndroidElement> driver;
	@Test
	  public void eBaytestCase() throws MalformedURLException, InterruptedException {
	    AndroidDriver<AndroidElement> driver = Digy4AndroidAppTestNGSupport.getWebDriver();
	    eBayPage.setcross(driver);
	    eBayPage.setselling(driver);
	    eBayPage.setdeal(driver);
	    eBayPage.setfashion(driver);
	    eBayPage.setsearch(driver);
	    eBayPage.setsearch_text(driver);
	    eBayPage.setsearchelementclicked(driver);
	    eBayPage.setmodal(driver);
	    eBayPage.setsort(driver);
	    eBayPage.setsort_option(driver);
	    eBayPage.setsortFirst(driver);
	    eBayPage.setsort_option_First(driver);
	    eBayPage.setsortSecond(driver);
	    eBayPage.setsort_option_second(driver);
	    eBayPage.setsortThird(driver);
	    eBayPage.setsort_option_Third(driver);
	    eBayPage.setsortFourth(driver);
	    eBayPage.setsort_option_fourth(driver);
	    eBayPage.setFilter(driver);
	    eBayPage.setFilter_Condition(driver);
	    eBayPage.setFilter_Condition_Option(driver);
	    eBayPage.setFilter_Condition_Button(driver);
	    eBayPage.setDealOne(driver);
	    eBayPage.setFeature_Deals(driver);
	    eBayPage.setHamburgerMenu(driver);
	    eBayPage.setHamburger_Sellings(driver);
	    eBayPage.setHamburgermenuone(driver);
	    eBayPage.setHamburger_Categories(driver);
	    eBayPage.setCategories_Baby(driver);
	    eBayPage.setCategories_Baby_Back_Arrow(driver);
	    eBayPage.setHamburgermenuSecond(driver);
	    eBayPage.setHamburger_Deals(driver);
}
}