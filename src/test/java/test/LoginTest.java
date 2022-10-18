package test;


import org.testng.annotations.Test;

import pom.Login;

public class LoginTest extends Base {

	String username= "dan@gmail.com";
	String password ="test123";

	@Test
	public void loginValidation() {

		Login Login= new Login(driver);
		Login.login(username,password);






	}
}
