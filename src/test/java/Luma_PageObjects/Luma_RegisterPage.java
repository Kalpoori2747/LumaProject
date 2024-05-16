package Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_RegisterPage {
	
	WebDriver driver;
	
	public Luma_RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="email_address")
	WebElement email_addr;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="password-confirmation")
	WebElement cPassword;
	
	@FindBy(xpath="//button[@class='action submit primary']")
	WebElement bntCreate;
	
	
	public void setFirstname(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		email_addr.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void setCpassword(String cpwd) {
		cPassword.sendKeys(cpwd);
	}
	
	public void clickCreateBtn() {
		bntCreate.click();
	}
}
