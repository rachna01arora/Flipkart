package repository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser1 {
public WebDriver driver;
	public openbrowser1(WebDriver driver) {
		this.driver=driver;
	}

	public void openbrowsertestcase(String chromeproperty, String path, String URL ){
	
	System.setProperty(chromeproperty, path);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(URL);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
}
