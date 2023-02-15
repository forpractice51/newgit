package pages;

import org.openqa.selenium.By;

import commonmethods.BaseClass;

public class LoginPage extends BaseClass
{
	
	public void userName() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		}
	
	public void passWord() {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		}
	
	public void loginButton() {
		driver.findElement(By.id("login-button")).click();
		
		}
}
