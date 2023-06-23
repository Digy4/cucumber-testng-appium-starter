package testng;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.digy4.java.mobiletesting.Digy4AndroidAppTestNGSupport;
public class MySunLifeBSTestNG{
	
  @Test
  public void testTheFirstAndroidCase() throws MalformedURLException {
    AndroidDriver<AndroidElement> driver = Digy4AndroidAppTestNGSupport.getWebDriver();
    AndroidElement allow1 = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.android.permissioncontroller:id/permission_allow_button")));
    allow1.click();
    AndroidElement close = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='Close']")));
    close.click(); 
    AndroidElement cross1 = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text='close']")));
    cross1.click();
    AndroidElement forgotusername1 = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='Forgot Username/Password']")));
    forgotusername1.click();
    AndroidElement forgotusername2 = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//*[@text='I forgot my username']")));
    forgotusername2.click();
    AndroidElement back1 = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text='arrow back']")));
    back1.click();
    AndroidElement forgotpassword = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//*[@text='I forgot my password']")));
    forgotpassword.click();
    AndroidElement back2 = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text='arrow back']")));
    back2.click();
    AndroidElement back3 = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.Button[@text='arrow back']")));
    back3.click();
    AndroidElement languagechange1 = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//*[@text='繁體']")));
    languagechange1.click();
    AndroidElement languagechange2 = (AndroidElement) new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//*[@text='English']")));
    languagechange2.click();

  }
}
