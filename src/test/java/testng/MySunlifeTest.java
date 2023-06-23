package testng;
import java.net.MalformedURLException;
import org.testng.annotations.Test;
import com.digy4.java.mobiletesting.Digy4AndroidAppTestNGSupport;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.MySunLifePage;

public class MySunlifeTest {
	AndroidDriver<AndroidElement> driver;
	@Test
	  public void mysunlifetestCase() throws MalformedURLException {
	    AndroidDriver<AndroidElement> driver = Digy4AndroidAppTestNGSupport.getWebDriver();
	    MySunLifePage mspage=new MySunLifePage(driver);
	    mspage.setallowbutton(driver);
	    mspage.setclosebutton(driver);
	    mspage.setcrossbutton(driver);
        mspage.setforgotusername1link(driver);
        mspage.setforgotusername2link(driver);
        mspage.setback1arrow(driver);
        mspage.setforgotpasswordlink(driver);
	    mspage.setback2arrow(driver);
	    mspage.setback3arrow(driver);
	    mspage.setlanguagechange1button(driver);
	    mspage.setlanguagechange2button(driver);
}
}