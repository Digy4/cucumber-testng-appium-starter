# cucumber-testng-appium-starter
Cucumber with TestNG and Selenium/Appium starter to use with DigyRunner

[Cucumber](https://cucumber.io/docs/installation/java/) with [TestNG](https://testng.org) and [Selenium](https://www.selenium.dev/) Integration with DigyRunner to be able to run against any Remote selenium grid and visualise in Digy Dashboard.


![Digy4 Logo](https://digy4.com/wp-content/uploads/2021/12/logo.png)

### How to build and run using maven
- How to install maven https://maven.apache.org/install.html

### Try Digy4 Pre-Integrated StarterKit and View Results Instantly in the Dashboard
- Have you created an account with DigyDashboard? Please click https://dashboard.digy4.com to create one
- Login to your account and click on Admin Panel -> Projects -> Add Project to the bottom left section of the dashboard
- Add a Project name that (eg: Demo) and other details and submit it
- Click Profile under user icon on the top right section of the dashboard
- Under Credentials section, copy Client ID and Client Secret and have it somewhere safe
- Clone the repository. Run `git clone https://github.com/Digy4/cucumber-testng-appium-starter`
- `cd cucumber-testng-appium-starter`

### Download APK file and upload to BrowserStack
#### Download eBay APK file from:
- https://apkcombo.com/ebay/com.ebay.mobile/download/phone-6.90.0.1-apk (manually download this apk file)
#### Upload APK file to BrowserStack
- curl -u "username:access_key" \ 
 -X POST "https://api-cloud.browserstack.com/app-automate/upload" \ 
 -F "file=@/path/to/your/app/eBay_6.90.0.1_apkcombo.com.apk"
- Then the response should like 
   {"app_url":"bs://1d9a80cc6a33e93e1b39986d8baefdee79808cc5"}

The app_url will be used in the following app property
-Ddigy4.browserstack.android.app=bs://1d9a80cc6a33e93e1b39986d8baefdee79808cc5

### Run the Test
- For -Ddigy4.projectName=, use the project name you have created above (eg: Demo)
- For digy4.client_id use the client ID and digy4.client_secret, use the client secret from above
- `mvn clean install -Ddigy4.framework=cucumber -Ddigy4.teamName=Native -Ddigy4.projectName=demo -Ddigy4.testType=MOBILE_APP -Ddigy4.cloudFarm=browserstack -Ddigy4.moduleName=Search -Ddigy4.suiteName=integration -Ddigy4.threads=2 -Ddigy4.browser=browserstack.android -Ddigy4.hubUrl=https://<username>:<key>@hub-cloud.browserstack.com/wd/hub -Ddigy4.client_id= -Ddigy4.client_secret= -Ddigy4.browserstack.android.app=bs://1d9a80cc6a33e93e1b39986d8baefdee79808cc5`
- Once this has completed, you can see the results in the DigyDashboard https://dashboard.digy4.com
- Details steps available here - https://help.digy4.com/docs/digy-dashboard/digyrunner-integration/cucumber-testng-appium


### IOS native app testing
- Enable IOS native app testing mode by setting `digy4.browser=browserstack.ios`
- Specify the BrowserStack hub url by setting `digy4.hubUrl=<browser stack hub url>`
- Additionally set the following properties under src/resources/digy4.config.properties
  - `digy4.browserstack.ios.device=<device name>` - Defaults to `iPhone 13`
  - `digy4.browserstack.ios.os_version=<os version>` - Defaults to `15`
  - `digy4.browserstack.ios.app=<app url in backstage>` - Defaults to `bs://e160bc9ee904d704137a8fcd8c453e83893c8c7b`

### Android native app testing
- Enable Android native app testing mode by setting `digy4.browser=browserstack.android`
- Specify the BrowserStack hub url by setting `digy4.hubUrl=<browser stack hub url>`
- Additionally set the following properties  under src/resources/digy4.config.properties
  - `digy4.browserstack.android.device=<device name>` - Defaults to `Samsung Galaxy S8 Plus`
  - `digy4.browserstack.android.os_version=<os version>` - Defaults to `7.0`
  - `digy4.browserstack.android.app=<app url in backstage>` - Defaults to `bs://d819306973ab53a0bb7dc135ef257f83fa7b445a`

## Explore the results in the Digy Dashboard
- Visit `https://dashboard.digy4.com/`
