package com.digy4.cucumber.steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.digy4.java.mobiletesting.cucumber.ios.Digy4IOSAppCucumberSupport;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;

public class utubeStepdefinition {
	WebDriver driver;
	public utubeStepdefinition() {
        driver = Digy4IOSAppCucumberSupport.getWebDriver();
    }
	
	@Given("user clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
	 IOSElement continueButton = (IOSElement) new WebDriverWait(driver, 30).until(
		ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]")));
	    continueButton.click();   
	}
	@And("user clicks on signin button")
	public void user_clicks_on_signin_button() {
	 IOSElement siginButton = (IOSElement) new WebDriverWait(driver, 30).until(
		ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Sign in with Google\"]")));
		siginButton.click();
	}
	@And("user again clicks on continue button")
	public void user_again_clicks_on_continue_button() {
	 IOSElement continueButton1 = (IOSElement) new WebDriverWait(driver, 30).until(
	    ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeButton[@name=\"Continue\"]")));
		continueButton1.click();
	}
	@And("then user clicks on allow button")
	public void then_user_clicks_on_allow_button() {
	IOSElement allowButton = (IOSElement) new WebDriverWait(driver, 30).until(
		ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeButton[@name=\"Allow\"]")));
		allowButton.click();
	}
	@And("user enters the email")
	public void user_enters_the_email() {
	IOSElement emailInput = (IOSElement) new WebDriverWait(driver, 30).until(
		ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeTextField[@name=\"Email or phone\"]")));
		emailInput.sendKeys("renyunfeng66@gmail.com");
	}
	@And("then user clicks on next button")
	public void then_user_clicks_on_next_button() {
	 IOSElement nextButton = (IOSElement) new WebDriverWait(driver, 30).until(
		ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeButton[@name=\"Next\"]")));
		nextButton.click();
	}
	@And("user enters the password")
	public void user_enters_the_password() {
	 IOSElement passwordInput = (IOSElement) new WebDriverWait(driver, 30).until(
		ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeSecureTextField[@name=\"Enter your password\"]")));
		passwordInput.sendKeys("Love@0605");
	}
	@And("user again clicks on next button")
	public void user_again_clicks_on_next_button() {
	IOSElement nextButton1 = (IOSElement) new WebDriverWait(driver, 30).until(
		ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeButton[@name=\"Next\"]")));
		nextButton1.click();
	}
	@Then("video starts playing")
	public void video_starts_playing() {
	IOSElement shortVideo = (IOSElement) new WebDriverWait(driver, 30).until(
	    ExpectedConditions.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeOther[@name=\"eml.shorts-shelf\"]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther")));
		shortVideo.click();
	}

}
