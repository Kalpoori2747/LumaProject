package Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_LoginPage {
	
	//constructor,identify the elements,actions
	WebDriver driver;
	public Luma_LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement txtEmail;
	
	@FindBy(id="pass")
	WebElement txtPassword;
	
	@FindBy(id="send2")
	WebElement btnSignin;
	
	//create the actions
	public void setEmail(String Email) {
		txtEmail.sendKeys(Email);
	}
	
	public void setPassword(String pword) {
		txtPassword.sendKeys(pword);
	}
	
	public void ClickSigninbtn() {
		btnSignin.click();
	}

}
