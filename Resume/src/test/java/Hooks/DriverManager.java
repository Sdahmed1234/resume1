package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
public static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");	
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		}
		return driver;	

}

}
