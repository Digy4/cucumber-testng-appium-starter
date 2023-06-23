package testng;
import java.net.MalformedURLException;
import org.testng.annotations.Test;
import com.digy4.java.mobiletesting.Digy4AndroidAppTestNGSupport;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.MyntraPage;

public class MyntraTest {
	AndroidDriver<AndroidElement> driver;
	@Test
	  public void myntratestCase() throws MalformedURLException {
	    AndroidDriver<AndroidElement> driver = Digy4AndroidAppTestNGSupport.getWebDriver();
	    MyntraPage mpage=new MyntraPage(driver);
	    mpage.setmen(driver);
	    mpage.setwomen(driver);
	    mpage.setkids(driver);
	    mpage.setbeauty(driver);
	    mpage.setcategories(driver);
	    mpage.setstudio(driver);
	    mpage.setexplore(driver);
}
}
