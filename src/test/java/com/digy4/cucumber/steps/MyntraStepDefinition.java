package com.digy4.cucumber.steps;
import com.digy4.java.mobiletesting.cucumber.android.Digy4AndroidAppCucumberSupport;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.MyntraPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyntraStepDefinition {
	AndroidDriver<AndroidElement> driver ;
	MyntraPage mpage=new MyntraPage(driver);
    public MyntraStepDefinition() {
        driver = (AndroidDriver<AndroidElement>) Digy4AndroidAppCucumberSupport.getWebDriver();
    }
	@Given("user launches the Myntra native app and clicks on men section and navigates to that men's page")
	public void user_launches_the_myntra_native_app_and_clicks_on_men_section_and_navigates_to_that_men_s_page() {
		mpage.setmen(driver);
	}
	@And("user clicks on women section and navigates to that women's page")
	public void user_clicks_on_women_section_and_navigates_to_that_women_s_page() {
		mpage.setwomen(driver); 
	}
	@And("user clicks on kids section and navigates to that kids page")
	public void user_clicks_on_kids_section_and_navigates_to_that_kids_page() {
		mpage.setkids(driver);  
	}
	@And("user clicks on beauty section and navigates to that beauty page")
	public void user_clicks_on_beauty_section_and_navigates_to_that_beauty_page() {
		 mpage.setbeauty(driver); 
	}
	@And("user clicks on categories and navigates to that categories page")
	public void user_clicks_on_categories_and_navigates_to_that_categories_page() {
        mpage.setcategories(driver);
	}
	@And("user clicks on studio and navigates to that studio page")
	public void user_clicks_on_studio_and_navigates_to_that_studio_page() {
        mpage.setstudio(driver);
	}
	@And("user clicks on explore and navigates to that explore page")
	public void user_clicks_on_explore_and_navigates_to_that_explore_page() {
        mpage.setexplore(driver);
	}
}
