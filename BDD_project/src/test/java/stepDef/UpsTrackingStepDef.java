package stepDef;

import static org.testng.Assert.fail;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ups.SetupDriver;
import ups.UpsTrackingAction;

public class UpsTrackingStepDef {
	
	UpsTrackingAction trackAction = new UpsTrackingAction();

	@Given("^: ups tracking page is launched$")
	public void ups_tracking_page_is_launched() {
		
		trackAction.launchUpsTrackingPage();
		
		if (SetupDriver.driver.getTitle().toLowerCase().contains("home")) {
			System.out.println(">> Successfully launched Tracking page");
		} else {
			System.out.println("FAILED");
			fail();
		}
	    
	}

	@When("^: click on tracking link$")
	public void click_on_tracking_link()  {
		trackAction.trackingLink();
		
		
	}

	@When("^: click on track and tracking history link$")
	public void click_on_track_and_tracking_history_link()  {
		trackAction.trackingHisLink();
	}

	@When("^: input wrong tracking number$")
	public void input_wrong_tracking_number()  {
		trackAction.trackingText();
	}

	@When("^: click on tracking button$")
	public void click_on_tracking_button() {
		trackAction.submitTrack();
	}
	@Then("^: displayed an error message$")
	public void displayed_an_error_message()  {
		
		
		String trackMsg = trackAction.submitMsg();
		
		if(trackMsg.toLowerCase().contains("verify the number")) {
			System.out.println(">>passed");
		}else {
			System.out.println(">>failed");
		}
	}

}
