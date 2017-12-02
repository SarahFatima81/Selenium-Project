package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;

public class Homepage extends BaseTest {
	public static Logger log = LogManager.getLogger(BaseTest.class.getName());
	
	@BeforeTest
	public void initializeBrowser() throws IOException{
		driver = driverInitializer();
		
	}
	
	
	@Test(dataProvider = "getData")
	public void HomepageNavg(String username, String password){
		
		
		driver.get("http://qaclickacademy.com");
		
		LandingPage l = new LandingPage(driver);
		l.Login().click();
		LoginPage lgpg = new LoginPage(driver);
		lgpg.emailAddr().sendKeys(username);
		lgpg.passWord().sendKeys(password);
		lgpg.loginBtn().click();
		log.info("Successfully validated login data");
		
	}


 @DataProvider 
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		data[0][0] = "sefse@few.com";
		data[0][1] = "drw";
		
		data[1][0]= "drte@dwt.com";
		data[1][1] = "ewrt";
		
		
		data[2][0] = "dwrw@fet.com";
		data[2][1] = "efwwe";
		return data;
		
		
	
		
	}
@AfterTest
public void teardown(){
	driver.close();
	driver = null;
}
	
} 