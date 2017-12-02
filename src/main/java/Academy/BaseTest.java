package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest {
	
	public static WebDriver driver;
	
	public WebDriver driverInitializer() throws IOException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\syed\\Project\\src\\main\\java\\Academy\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		
		if(browserName.equals("chrome")){

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed\\Documents\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")){
			
			driver = new FirefoxDriver();
			
		}
		
		else if(browserName.equals("IE Explorer")){
	    	
	    	System.setProperty("webdriver.ie.driver", "C:\\Users\\syed\\Downloads\\IEDriverServer_x64_3.6.0 (3)\\IEDriverServer.exe");
	    	
	    	driver = new InternetExplorerDriver();
	    }
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
//public void getScreenshot(String result) throws IOException{
	
	//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(src, new File("C:\\Users\\syed\\Desktop\\test" + result + "\\screenshot.png"));

	
}
//}
