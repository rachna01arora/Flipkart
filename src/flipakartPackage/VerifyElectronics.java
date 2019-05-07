package flipakartPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import repository.openbrowser1;
import repository.screenshots;

public class VerifyElectronics {
	WebDriver driver;
  @Test
  public void verifyelectronicslink() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.className("_2zrpKA")).sendKeys("rachna01arora@gmail.com");
	  driver.findElement(By.xpath("//*[@type='password' and @class='_2zrpKA _3v41xv']")).sendKeys("NAPnew@123456");
	   driver.findElement(By.xpath("//*[text()='Login']/following::button[@type='submit']")).submit();
	   driver.manage().window().maximize();
	  
	  // code for the Verify electronics link
	
	 Actions object = new Actions(driver);
	 object.moveToElement(driver.findElement(By.xpath("//*[@class='_1QZ6fC _3Lgyp8']/preceding::*[text()='Electronics']"))).click().build().perform();
	 
	 driver.findElement(By.xpath("//li[@class='_1KCOnI _2BfSTw _1h5QLb _3ZgIXy']//a[@title='Mobiles'][contains(text(),'Mobiles')]")).click();
	 Select Min=new Select(driver.findElement(By.className("fPjUPw")));
	 Min.selectByValue("10000");   
	 
	 Select Amount=new Select(driver.findElement(By.xpath("//div[@class='_1YoBfV']//select[@class='fPjUPw']")));
	 Amount.selectByValue("16000");
	 
	 
  }
}

