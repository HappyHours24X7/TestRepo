package googleImageLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;


public class googleImageLink {
	WebDriver driver;
	
	@Given("^User navigates to google$")
	public void User_navigates_to_google() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");}

	@When("^User clicks on Images hyperlink$")
	public void User_clicks_on_Images_hyperlink() {
		//driver.get("http://www.google.com");
		driver.findElement(By.linkText("Images")).click();
	}

	@Then("^User should be redirected to Google Images page$")
	public void User_should_be_redirected_to_Google_Images_page() {
		if(driver.getTitle().equalsIgnoreCase(
		         "Google Images")){ 
		            System.out.println("Navigated to Google Image Page"); 
		      } else { 
		         System.out.println("Not on Google Image Page :("); 
		      } 
	    driver.close();
	}

}
