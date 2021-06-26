package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class HomePage extends Base{

	@Test
	public void basePageNavigation() throws IOException {
		
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
	}
	
}
