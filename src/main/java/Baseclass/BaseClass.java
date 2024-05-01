package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver browserLanch(String type) {
     
	if (type.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	
	else if (type.equalsIgnoreCase("firefox")) {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
	}
	
	driver.manage().window().maximize();
	
	return driver;
	
	}
	
	public static void geturl() {
	
		

	}
}
