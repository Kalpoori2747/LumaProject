package Luma_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Luma_ReadingData {
	
	 Properties pro;
		
	 //create the constructor
	public Luma_ReadingData(){
		//configure the properties file
		
		File f=new File("./PropertiesFiles\\Data.properties");
	
		//convert that file into reading mode
		try {
		FileInputStream fis=new FileInputStream(f);
		 pro=new Properties();
		pro.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public String getRegisterurl() {
		
		String url=pro.getProperty("Url");
		return url;
	}
	
	public String getFirstname() {
		String firstname = pro.getProperty("Firstname");
		return firstname;
	}
	
	public String getLastname() {
		String lastname = pro.getProperty("Lastname");
		return lastname;
	}
	
	public String getEmail() {
		String email = pro.getProperty("Email");
		return email;
	}
	
	public String getPassword() {
		String password= pro.getProperty("Password");
		return password;
	}
	
	public String getCpassword() {
		String cpassword= pro.getProperty("Cpassword");
		return cpassword;
	}

}
