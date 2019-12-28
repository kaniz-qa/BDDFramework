package ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

public class UpsTrackingAction {

	UpsTrackingElement trackElement;
	
	public UpsTrackingAction() {
		trackElement = new UpsTrackingElement();
		PageFactory.initElements(SetupDriver.driver, trackElement);
	}
	
	
	public void launchUpsTrackingPage() {
		SetupDriver.driver.get("https://www.ups.com/us/en/Home.page");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void trackingLink() {
		trackElement.tracking.click();
	}
	
	public void trackingHisLink() {
		trackElement.trackHistory.click();
	}
	
	public void trackingText() {
		trackElement.trackingText.sendKeys("helloworld12345");
	}
	
	
	public void submitTrack() {
		trackElement.submitTrack.click();
	}
	
	
	public String submitMsg() {
		String trackMsg = trackElement.submitMsg.getText();
		return trackMsg;

	}
	
	
	
}
