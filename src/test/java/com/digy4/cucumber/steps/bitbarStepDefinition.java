package com.digy4.cucumber.steps;

import com.digy4.java.mobiletesting.cucumber.ios.Digy4IOSAppCucumberSupport;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class bitbarStepDefinition {
    IOSDriver<IOSElement> driver;

    public bitbarStepDefinition() {
//        driver = (AndroidDriver<AndroidElement>) Digy4AndroidAppCucumberSupport.getWebDriver();
        driver = (IOSDriver<IOSElement>) Digy4IOSAppCucumberSupport.getWebDriver();
    }

    @Given("user sees the bitbar app open")
    public void user_sees_app() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            driver.findElement(By.xpath("//*[@text=\"faillure\"]"));
        } catch (Exception e) {
            System.out.print("Exception occurred: " + e.getMessage());
        }

        boolean logoPresent = driver.findElement(By.xpath("//*[@content-desc='Bitbar logo']")).isDisplayed();
        if (logoPresent)
            System.out.println("App is open and Logo is displayed");
        else
            System.out.println("App failed to open");
    }

    @And("user clicks on the Use Testdroid Cloud button")
    public void user_clicks_on_right_answer() throws InterruptedException {
        driver.findElement(By.xpath("//*[@text=\"Use Testdroid Cloud\"]"))
                .click();
    }

    @And("enters tester name into the name field")
    public void user_enters_name() throws InterruptedException {
        driver.findElement(By.xpath("//*[@resource-id=\"com.bitbar.testdroid:id/editText1\"]"))
                .sendKeys("Tester");
    }

    @And("user clicks on the submit button")
    public void user_clicks_on_submit() throws InterruptedException {
        driver.findElement(By.xpath("//*[@resource-id=\"com.bitbar.testdroid:id/button1\"]"))
                .click();
    }

    @And("user sees the success message")
    public void user_sees_success_msg() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@text=\"You are right!\"]"))
                .isDisplayed());
    }
}
