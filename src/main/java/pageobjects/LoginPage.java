package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	public WebDriver driver;
	By emailID = By.name("user[email]");
	By psword = By.id("user_password");
	By lgIn = By.name("commit");
			
 public LoginPage(WebDriver driver){
	 this.driver = driver;
 }

 public WebElement emailAddr(){
	 
	 return driver.findElement(emailID);
 }
 
 public WebElement passWord(){
	 return driver.findElement(psword);
 }
 
 public WebElement loginBtn(){
	 return driver.findElement(lgIn);
 }
 
}



