package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Academy.BaseTest;

public class LandingPage {
	
	public WebDriver driver;
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".text-center>h2");
	By nvbar = By.cssSelector(".navbar.navbar-default.navbar-static-top");
	
 public LandingPage(WebDriver driver){
	 this.driver = driver;
}

 public WebElement Login(){
	 
	 return driver.findElement(signin);
 }
  public WebElement getTitle(){
	  
	  return driver.findElement(title);
  }
  public WebElement getNavBar(){
	  return driver.findElement(nvbar);
  }
}
