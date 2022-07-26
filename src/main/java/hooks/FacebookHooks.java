package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class FacebookHooks {
	
	@Before(order=2)
	public void openSetup() {
		String a = "Opening the browser";
		System.out.println(a);
	}
	@Before(order=1)
	public void openapp(Scenario sc) {
		//String a = "Opening the application";
		System.out.println(sc.getName());
	
	}

	@After(order=1)
	public void tearDown() {
		System.out.println("Closing the browser");
	}
	
	@BeforeStep()
	public void screenshoots() {
		System.out.println("TAKE SCREEN SHOOT");
	}
}
