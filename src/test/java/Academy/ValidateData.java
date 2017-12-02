package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LandingPage;

public class ValidateData extends BaseTest {
	
	public static Logger log = LogManager.getLogger(BaseTest.class.getName());
	
@BeforeTest 

public void initializeBrowser() throws IOException{
	driver = driverInitializer();
	
	log.info("Driver is initialized");
	
	driver.get("http://qaclickacademy.com");
	log.info("Navigated to Homepage");
}
	@Test
	public void validateTitle(){
		
		
		
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES 123");
		log.info("Successfully validated text message");
		
		
		
}
	@AfterTest
		
		public void teardown(){
			
			driver.close();
			driver = null; 
			
			log.info("Closed the driver");
		}
}