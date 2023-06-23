package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MySunLifePage {
//static WebDriver driver;
static AndroidDriver<AndroidElement> driver;
static By allow1= MobileBy.id("com.android.permissioncontroller:id/permission_allow_button"); 
static By close= MobileBy.xpath("//android.widget.Button[@text='Close']"); 
static By cross1= MobileBy.xpath("//android.widget.Button[@text='close']"); 
static By forgotusername1=MobileBy.xpath("//*[@text='Forgot Username/Password']"); 
static By forgotusername2=MobileBy.xpath("//*[@text='I forgot my username']"); 
static By back1=MobileBy.xpath("//android.widget.Button[@text='arrow back']"); 
static By forgotpassword=MobileBy.xpath("//*[@text='I forgot my password']");
static By back2=MobileBy.xpath("//android.widget.Button[@text='arrow back']");
static By back3=MobileBy.xpath("//android.widget.Button[@text='arrow back']");
static By languagechange1=MobileBy.xpath("//*[@text='繁體']");
static By languagechange2=MobileBy.xpath("//*[@text='English']");

public MySunLifePage(AndroidDriver<AndroidElement>  driver) {
		MySunLifePage.driver = driver;
}
public static void setallowbutton(AndroidDriver<AndroidElement> driver) {
    AndroidElement allow = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(allow1));
    allow.click();
    }
public static void setclosebutton(AndroidDriver<AndroidElement>  driver) {
    AndroidElement closebtn = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(close));
    closebtn.click();
    }
public static void setcrossbutton(AndroidDriver<AndroidElement>  driver) {
    AndroidElement  crossbtn = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(cross1));
    crossbtn.click();
    }
public static void setforgotusername1link(AndroidDriver<AndroidElement>  driver) {
    AndroidElement forgotusername1l = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(forgotusername1));
    forgotusername1l.click();
    }
public static void setforgotusername2link(AndroidDriver<AndroidElement>  driver) {
    AndroidElement forgotusername2l = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(forgotusername2));
    forgotusername2l.click();
    }
public static void setback1arrow(AndroidDriver<AndroidElement>  driver) {
    AndroidElement back1arw = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(back1));
    back1arw.click();
    }
public static void setforgotpasswordlink(AndroidDriver<AndroidElement>  driver) {
    AndroidElement forgotpasswordl = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(forgotpassword));
    forgotpasswordl.click();
    }
public static void setback2arrow(AndroidDriver<AndroidElement>  driver) {
    AndroidElement back2arw = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(back2));
    back2arw.click();
    }
public static void setback3arrow(AndroidDriver<AndroidElement>  driver) {
    AndroidElement back3arw = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(back3));
    back3arw.click();
    }
public static void setlanguagechange1button(AndroidDriver<AndroidElement>  driver) {
    AndroidElement languagechange1btn = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(languagechange1));
    languagechange1btn.click();
    }

public static void setlanguagechange2button(AndroidDriver<AndroidElement>  driver) {
    AndroidElement languagechange2btn = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(languagechange2));
    languagechange2btn.click();
    }

}