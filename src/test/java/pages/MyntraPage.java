package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MyntraPage {
	static AndroidDriver<AndroidElement> driver;
	static By men1=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup"); 
	static By back22=MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"leftElement\"]/android.widget.TextView"); 
	static By women1=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup"); 
	static By back33=MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"leftElement\"]/android.widget.TextView"); 
	static By kids1=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup"); 
	static By back44=MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"leftElement\"]/android.widget.TextView"); 
	static By beauty1=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup");
	static By back55=MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"leftElement\"]/android.widget.TextView");
	static By categories1=MobileBy.xpath("//android.widget.Button[@content-desc=\"tabButton_categories\"]/android.widget.ImageView");
	static By studio1=MobileBy.xpath("//android.widget.Button[@content-desc=\"tabButton_studio\"]/android.widget.ImageView");
	static By explore1=MobileBy.xpath("//android.widget.Button[@content-desc=\"tabButton_more\"]/android.widget.ImageView");

	public MyntraPage(AndroidDriver<AndroidElement>  driver) {
		MyntraPage.driver = driver;
	}
	public static void setmen(AndroidDriver<AndroidElement> driver) {
		AndroidElement men = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(men1));
	    men.click(); 
	    AndroidElement back2 = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(back22));
	    back2.click();
	    }
	public static void setwomen(AndroidDriver<AndroidElement> driver) {
		AndroidElement women = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(women1));
	    women.click(); 
	    AndroidElement back3 = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(back33));
	    back3.click();
    }
	public static void setkids(AndroidDriver<AndroidElement> driver) {
		AndroidElement kids = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(kids1));
	    kids.click();
	    AndroidElement back4 = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(back44));
	    back4.click();   
    }
	public static void setbeauty(AndroidDriver<AndroidElement> driver) {
		 AndroidElement beauty = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(beauty1));
		 beauty.click();
		 AndroidElement back5 = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(back55));
		 back5.click();    
    }
	public static void setcategories(AndroidDriver<AndroidElement> driver) {
		AndroidElement categories = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(categories1));
	    categories.click();    
    }
	public static void setstudio(AndroidDriver<AndroidElement> driver) {
		AndroidElement studio = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(studio1));
	    studio.click();    
    }
    public static void setexplore(AndroidDriver<AndroidElement> driver) {
    	AndroidElement explore = (AndroidElement)new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(explore1));
	    explore.click();    
    }
}
