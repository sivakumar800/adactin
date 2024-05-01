package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
		glue = "com.adactin.stepdefinition",
		monochrome =true,
		dryRun = false,
		strict = true,
		plugin = {"html:Reports/Html_Reports",
				"pretty",
				"json:Reports/Json_Report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"
})

public class Runnerclass  {
	
	

public static WebDriver driver;


@BeforeClass
public static void setUp() {
	
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
}

@AfterClass
public static void teardown() {
	
	driver.close();
}

	

}
