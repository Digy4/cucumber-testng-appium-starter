package logic;
import com.digy4.java.mobiletesting.cucumber.android.Digy4AndroidAppCucumberSupport;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.eBayPage;

public class eBayStepdefinition {
	AndroidDriver<AndroidElement> driver ;
    public eBayStepdefinition() {
        driver = (AndroidDriver<AndroidElement>) Digy4AndroidAppCucumberSupport.getWebDriver();
    }
    @Given("user clicks on cross icon")
    public void user_clicks_on_cross_icon() throws InterruptedException {
      eBayPage.setcross(driver);  
    }
    @And("user clicks on selling")
    public void user_clicks_on_selling() throws InterruptedException {
       eBayPage.setselling(driver);
    }
    @And("again user clicks on deal")
    public void again_user_clicks_on_deal() throws InterruptedException {
       eBayPage.setdeal(driver);   
    }
    @And("again user clicks on fashion")
    public void again_user_clicks_on_fashion() throws InterruptedException {
        eBayPage.setfashion(driver); 
    }
    @And("user clicks on search")
    public void user_clicks_on_search() throws InterruptedException {
       eBayPage.setsearch(driver); 
    }
    @And("user enters cars")
    public void user_enters_cars() throws InterruptedException {
       eBayPage.setsearch_text(driver); 
    }
    @And("user clicks on search icon")
    public void user_clicks_on_search_icon() throws InterruptedException {
       eBayPage.setsearchelementclicked(driver);
    }
    @And("user clicks on the save modal")
    public void user_clicks_on_the_save_modal() throws InterruptedException {
       eBayPage.setmodal(driver); 
    }
    @And("user selects sort options")
    public void user_selects_sort_options() throws InterruptedException {
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
    }
    @And("now user clicks on filter icon")
    public void now_user_clicks_on_filter_icon() throws InterruptedException {
        eBayPage.setFilter(driver);
    }
    @And("user clicks on condition")
    public void user_clicks_on_condition() throws InterruptedException {
       eBayPage.setFilter_Condition(driver);
    }
    @And("user clicks on show result button")
    public void user_clicks_on_show_result_button() throws InterruptedException {
        eBayPage.setFilter_Condition_Option(driver);
        eBayPage.setFilter_Condition_Button(driver);
    }
    @And("now uuser clicks on deals")
    public void now_uuser_clicks_on_deals() throws InterruptedException {
        eBayPage.setDealOne(driver);
    }
    @And("now user selects feture deals from deals screen")
    public void now_user_selects_feture_deals_from_deals_screen() throws InterruptedException {
        eBayPage.setFeature_Deals(driver);
    }
    @And("now user opens hamburger menu")
    public void now_user_opens_hamburger_menu() throws InterruptedException {
         eBayPage.setHamburgerMenu(driver);
    }
    @And("user clicks on sellings option")
    public void user_clicks_on_sellings_option() throws InterruptedException {
       eBayPage.setHamburger_Sellings(driver);
    }
    @And("again user clicks on hamburger menu")
    public void again_user_clicks_on_hamburger_menu() throws InterruptedException {
        eBayPage.setHamburgermenuone(driver);
    }
    @And("again user selects categories")
    public void again_user_selects_categories() throws InterruptedException {
        eBayPage.setHamburger_Categories(driver);
    }
    @And("now user click on baby from categories screen")
    public void now_user_click_on_baby_from_categories_screen() throws InterruptedException {
       eBayPage.setCategories_Baby(driver);
    }
    @And("now user navigates back from baby screen")
    public void now_user_navigates_back_from_baby_screen() throws InterruptedException {
       eBayPage.setCategories_Baby_Back_Arrow(driver);
    }
    @And("again clicks on hamburger menu")
    public void again_clicks_on_hamburger_menu() throws InterruptedException {
       eBayPage.setHamburgermenuSecond(driver);
    }
    @And("user selects deals")
    public void user_selects_deals() throws InterruptedException {
       eBayPage.setHamburger_Deals(driver);  
    }
}
