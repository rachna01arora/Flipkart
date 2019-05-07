package flipakartPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import repository.login;
import repository.openbrowser1;
import repository.screenshots;

public class verifyloginpage {
	WebDriver driver;
	
	openbrowser1 openbrowsertestcaseobject = new openbrowser1(driver);
	
	@Test(priority=0)
  public void openbrowser() {
		openbrowsertestcaseobject.openbrowsertestcase("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe","https://www.flipkart.com/");  
		driver=openbrowsertestcaseobject.driver;
		System.out.println(driver.getTitle());
		screenshots.capturescreenshot(driver, "Browseropen");
  }
	@Test(priority=1)
	public void loginflipkart(){
		
		login  loginobject = new login(driver);
		loginobject.logintestcase("rachna01arora@gmail.com", "NAPnew@123456");
		screenshots.capturescreenshot(driver, "Login");
		
	}
	
	@Test(priority=2)
	public void verifyloginhomepage(){
		System.out.println(driver.getTitle());
		//driver.close();
	}
}
