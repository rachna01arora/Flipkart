package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	
	public login(WebDriver driver){
		this.driver=driver;
	}	
	public void logintestcase(String emailid, String password){
	driver.findElement(By.className("_2zrpKA")).sendKeys(emailid);
	  driver.findElement(By.xpath("//*[@type='password' and @class='_2zrpKA _3v41xv']")).sendKeys(password);
	  driver.findElement(By.xpath("//*[text()='Login']/following::button[@type='submit']")).submit();
}
}
