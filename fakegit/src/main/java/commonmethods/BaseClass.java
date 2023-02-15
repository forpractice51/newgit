package commonmethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void initialization() 
	{
	
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://www.saucedemo.com/");
	}
	
	
	}
