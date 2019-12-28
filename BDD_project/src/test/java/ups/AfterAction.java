package ups;

import cucumber.api.java.After;


public class AfterAction {
	
	@After
	public void afterAction(){
		SetupDriver.tearDownDriver();
		System.out.println("----------");
	}

}
