package Luma_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Luma_PageObjects.Luma_LoginPage;

public class Luma_LoginTest_001 extends Luma_BaseClass {
	
	@Test
	public void Logintest() throws InterruptedException {
		
		Luma_LoginPage ll=new Luma_LoginPage(driver);
		
		ll.setEmail("ammavijju108@gmail.com");
		Thread.sleep(2000);
		ll.setPassword("Amma@2747");
		Thread.sleep(2000);
		ll.ClickSigninbtn();
		Thread.sleep(2000);
		
		String expTitle = "My Account";
		String actTitle = driver.getTitle();
		
		if(actTitle.equals(expTitle)) {
		Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	}
	

}
