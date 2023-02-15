package testCasees;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginData extends LoginPage{


		
	LoginPage lp=new LoginPage();
	
	
	@Test
	public  void testLoginData() {
		
		lp.userName();
		lp.passWord();
		lp.loginButton();
		
		
	}
	
	
	
	
	
	
	
	}


