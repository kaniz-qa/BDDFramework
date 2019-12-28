package ups;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsTrackingElement {

	@FindBy(xpath="//*[@id=\"ups-menuLinks0\"]")
	public WebElement tracking;
	
	@FindBy(xpath="//*[@id=\"ups-menuPanel0\"]/div/div[1]/ul/li[1]/a")
	public WebElement trackHistory;
	
	
	@FindBy(xpath="//*[@id=\"stApp_trackingNumber\"]")
	public WebElement trackingText;
	
	
	@FindBy(id="stApp_btnTrack")
	public WebElement submitTrack;
	
	
	@FindBy(xpath="//*[@id=\"stApp_statusErrorText\"]")
	public WebElement submitMsg;
	
}
