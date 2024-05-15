package Luma_Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Luma_BaseClass {
	
	public static WebDriver driver;
	@BeforeClass
	public void OpenApllication() {
		
		driver=new ChromeDriver();
		
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
	}
	
	@AfterClass
	public void CloseApplication() {
		driver.close();
	}

}
