package com.digy4.cucumber.steps;
import com.digy4.java.mobiletesting.cucumber.android.Digy4AndroidAppCucumberSupport;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.MySunLifePage;
import io.cucumber.java.en.Then;

public class MySunlifeStepdefinition {
	AndroidDriver<AndroidElement> driver ;

    public MySunlifeStepdefinition() {
        driver = (AndroidDriver<AndroidElement>) Digy4AndroidAppCucumberSupport.getWebDriver();
    }
    @Given("user launches the My Sun Life native app and allows access photos and media on your device popup")
    public void user_launches_the_my_sun_life_native_app_and_allows_access_photos_and_media_on_your_device_popup() {
    	MySunLifePage.setallowbutton(driver);
    	MySunLifePage.setclosebutton(driver);
    }
    
    @And("user selects Close from update available popup")
    public void user_selects_close_from_update_available_popup() {
    	MySunLifePage.setcrossbutton(driver);
    }
    @And("user selects Forgot username\\/password from sign in screen")
    public void user_selects_forgot_username_password_from_sign_in_screen() {
    	MySunLifePage.setforgotusername1link(driver);
    }
    @And("user selects I forgot my username")
    public void user_selects_i_forgot_my_username() {
    	MySunLifePage.setforgotusername2link(driver);
    }
    @And("user navigates back to Forgot username\\/password screen")
    public void user_navigates_back_to_forgot_username_password_screen() {
    	MySunLifePage.setback1arrow(driver);
    }
    @And("user selects I forgot my password")
    public void user_selects_i_forgot_my_password() {
    	MySunLifePage.setforgotpasswordlink(driver);
    }
    @And("again user navigates back to sign in screen")
    public void again_user_navigates_back_to_sign_in_screen() {
    	MySunLifePage.setback2arrow(driver);
    	MySunLifePage.setback3arrow(driver);
    	
    }
    @And("user changes language to HK")
    public void user_changes_language_to_hk() {
    	MySunLifePage.setlanguagechange1button(driver);
       
    }
    @Then("again user changes the language to English")
    public void again_user_changes_the_language_to_english() {
    	MySunLifePage.setlanguagechange2button(driver);
    }

}
