package Luma_Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Luma_Utilities.Luma_ReadingData;

public class Luma_BaseClass {

	public static WebDriver driver;

	Luma_ReadingData rd = new Luma_ReadingData();

	String url = rd.getRegisterurl();
	String firstname = rd.getFirstname();
	String lastname = rd.getLastname();
	String email = rd.getEmail();
	String pwd = rd.getPassword();
	String cpwd = rd.getCpassword();

	@BeforeClass
	@Parameters("browser")
	public void OpenApplication(String br) {

		if (br.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (br.equals("edge")) {
			driver = new EdgeDriver();
		} else if (br.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://magento.softwaretestingboard.com/customer/account/login/");  // Login URL for login test case
		driver.get(url);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void CloseApplication() {
//		driver.close();
	}

}
