package Luma_Testcases;

import org.testng.annotations.Test;

import Luma_PageObjects.Luma_RegisterPage;

public class Luma_RegisterTest_002 extends Luma_BaseClass{
	
	@Test
	public void registerTest() {
		Luma_RegisterPage rp = new Luma_RegisterPage(driver);
		
		rp.setFirstname(firstname);
		rp.setLastname(lastname);
		rp.setEmail(email);
		rp.setPassword(pwd);
		rp.setCpassword(cpwd);
		rp.clickCreateBtn();
		
			
	}
}
