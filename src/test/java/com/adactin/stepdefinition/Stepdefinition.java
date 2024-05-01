package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runnerclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Stepdefinition {
	
	public static WebDriver driver = Runnerclass.driver;
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");    
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Jivita04");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	}

	@Then("^user Click The Login Button And Its Navigate to Search Hotel Page$")
	public void user_Click_The_Login_Button_And_Its_Navigate_to_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}

	@When("^user Select Location In Test Data$")
	public void user_Select_Location_In_Test_Data() throws Throwable {
		WebElement Location = driver.findElement(By.xpath("//select[@id='location']"));
		Location.click();
		
		Select s = new Select(Location);
		s.selectByVisibleText("Sydney");	    
	}

	@When("^user Select Hotel In Test Data$")
	public void user_Select_Hotel_In_Test_Data() throws Throwable {
		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));	
	    Hotels.click();
         
	    Select h = new Select(Hotels);
	    h.selectByValue("Hotel Sunshine");
	}

	@When("^user Select RoomType In Test Data$")
	public void user_Select_RoomType_In_Test_Data() throws Throwable {
		WebElement Rooms = driver.findElement(By.xpath("//select[@id='room_type']"));
	    Rooms.click();
	    
	    Select r = new Select(Rooms);
	    r.selectByIndex(2);  
	}

	@When("^user Select NumberOfRooms In Test Data$")
	public void user_Select_NumberOfRooms_In_Test_Data() throws Throwable {
		WebElement nos = driver.findElement(By.xpath("//select[@id='room_nos']"));
	    nos.click();
	    Select R = new Select(nos);
	    R.selectByIndex(2);
	}

	
	@When("^user Select The AdultsPerRooms In Test Data$")
	public void user_Select_The_AdultsPerRooms_In_Test_Data() throws Throwable {
		WebElement Adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
	    Adults.click();
	    
	    Select A = new Select(Adults);
	    A.selectByIndex(2);
	    Thread.sleep(3000);
	}

	@Then("^user Click The Search Button And Its Navigate To Selet Hotel Page$")
	public void user_Click_The_Search_Button_And_Its_Navigate_To_Selet_Hotel_Page() throws Throwable {
		WebElement Search = driver.findElement(By.xpath("//input[@value='Search']"));
	    Search.click(); 
	    
	    Thread.sleep(3000);
	}

	@When("^user Select The Hotel For The All Details Checking To Select Hotel$")
	public void user_Select_The_Hotel_For_The_All_Details_Checking_To_Select_Hotel() throws Throwable {
		WebElement Radio = driver.findElement(By.xpath("//input[@type='radio']"));
		   Radio.click();
   
	}

	@Then("^user Clicck The Continue Button And Its Navigate To Book A Hotel page$")
	public void user_Clicck_The_Continue_Button_And_Its_Navigate_To_Book_A_Hotel_page() throws Throwable {
		WebElement Submit = driver.findElement(By.xpath("//input[@type='submit']"));
		   Submit.click();	    
	}

	@When("^user Enter The FirstName In FirstName Field$")
	public void user_Enter_The_FirstName_In_FirstName_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("siva");
	}

	@When("^user Enter The LastName In LastName Field$")
	public void user_Enter_The_LastName_In_LastName_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("kumar");
	}

	@When("^user Enter The BillingAddress In BillingAddress Field$")
	public void user_Enter_The_BillingAddress_In_BillingAddress_Field() throws Throwable {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("18 bharathi dasan st ch 78");
	}

	@When("^user Enter The CreditCardNo In CreditCardNo Field$")
	public void user_Enter_The_CreditCardNo_In_CreditCardNo_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("9440586098710201");
	}

	@When("^user Enter The CreditCardType In CreditCardType Field$")
	public void user_Enter_The_CreditCardType_In_CreditCardType_Field() throws Throwable {
		WebElement Card = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Card.click();
		   Select CC = new Select(Card);
		   CC.selectByValue("VISA");
	}

	@When("^user Enter The ExpiryDate To SelectMonth In SelectMonth Field$")
	public void user_Enter_The_ExpiryDate_To_SelectMonth_In_SelectMonth_Field() throws Throwable {
		WebElement Mon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		   Mon.click();
		   
		   		   
		   Select m = new Select(Mon);
		   m.selectByValue("6");
	}

	@When("^user Enter The ExpiryDate To SelectYear In SelectYear Field$")
	public void user_Enter_The_ExpiryDate_To_SelectYear_In_SelectYear_Field() throws Throwable {
		WebElement Year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		   Year.click();
		   
		   Thread.sleep(4000);
		   
		   Select Y = new Select(Year);
		   Y.selectByIndex(14);
	}

	@When("^user Entet The CVVNumber In CVVNumber Field$")
	public void user_Entet_The_CVVNumber_In_CVVNumber_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("456");

	}

	@Then("^user Click The BookNow Button And Its Navigate To Booking Confiromation Page$")
	public void user_Click_The_BookNow_Button_And_Its_Navigate_To_Booking_Confiromation_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='button']")).click();	
		Thread.sleep(5000);	    
	}

	@Then("^user Click To Logout Button And Its To Navigate To Hotel Login Page$")
	public void user_Click_To_Logout_Button_And_Its_To_Navigate_To_Hotel_Login_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@id='logout']")).click();
		Thread.sleep(2000);
		
	}
}




