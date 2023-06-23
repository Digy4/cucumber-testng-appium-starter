package com.digy4.cucumber;
import cucumber.utils.GetProperties;
import cucumber.utils.JiraInteraction;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

//
// Copyright (c) 2021 Digy4 Inc. and its affiliates. All rights reserved.
// Unauthorized copying of this file, via any medium is strictly prohibited
// Proprietary and confidential
// Any illegal or unauthorised usage or violations will result in immediate legal action.
//
@CucumberOptions(
		monochrome = true,
		features = {"src/test/resources/features-app"},
		glue = {"com.digy4.cucumber.steps","com.digy4.java.mobiletesting.cucumber.android"},
		plugin = {"pretty","json:target/cucumber/report.json", "html:target/cucumber/report.html",
				  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				  "com.digy4.java.mobiletesting.cucumber.android.Digy4AndroidAppCucumberSupport"}
		//tags = "(@Android)"
)
public class DigyAndroidTestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeClass(
			alwaysRun = true
	)
	public void setUpClass(ITestContext context) {
		if (GetProperties.xRayInteraction.equals("true") &&
				"XRAY".equalsIgnoreCase(GetProperties.testManagementTool)) {
			final JiraInteraction jiraInteraction = new JiraInteraction();
			try {
				jiraInteraction.exportTests(GetProperties.clientId, GetProperties.clientSecret, GetProperties.xRayUrl,
						GetProperties.xRayExecutionId, GetProperties.featureFileDir);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Not downloading tests from jira");
		}
		try {
			super.setUpClass(context);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

