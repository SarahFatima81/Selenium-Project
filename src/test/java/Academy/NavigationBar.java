package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LandingPage;

public class NavigationBar extends BaseTest {
	public static Logger log = LogManager.getLogger(BaseTest.class.getName());
	
	@BeforeTest
	public void initializeBrowser() throws IOException{
	driver = driverInitializer();
	
	driver.get("http://qaclickacademy.com");
	}
	
	@Test
	public void validateNvBar() throws IOException{
		
		
		//driver.get(prop.getProperty("url"));
		
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavBar().isDisplayed());
		log.info("Successfully validated the presence of Navigation bar");
		
		
		
}
	 @AfterTest
		
		public void teardown(){
			
			driver.close();
			driver = null;
		}
	 
}
