package logic;

import com.digy4.java.mobiletesting.cucumber.ios.Digy4IOSAppCucumberSupport;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

//
// Copyright (c) 2021 Digy4 Inc. and its affiliates. All rights reserved.
// Unauthorized copying of this file, via any medium is strictly prohibited
// Proprietary and confidential
// Any illegal or unauthorised usage or violations will result in immediate legal action.
//
public class IOSTestHelper {

    WebDriver driver ;

    public IOSTestHelper() {
        driver = Digy4IOSAppCucumberSupport.getWebDriver();
    }

    @Given("^user launches SunLife app in IOS")
    public void userLaunchesSunlifeApp() {
    }

    @When("^user enters credentials in IOS")
    public void userEntersCredentials() {
    }

    @And("^navigates random on the site in IOS")
    public void userNavigatesRandom() {
    }

}
