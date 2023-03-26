package Fotor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	static String driverPath = "C:\\Users\\pearl\\Desktop\\Selenium\\SeleniumJars\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	@Test
	public void loginFotor() throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver",driverPath);			
		driver = new ChromeDriver();
		driver.get("https://www.fotor.com");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create an account')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Sign up with email')]")).click();
		driver.findElement(By.xpath("//body/div[@id='rootLogin']/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/input[1]")).sendKeys("happypolyy@hotmail.com");
		driver.findElement(By.xpath("//body/div[@id='rootLogin']/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/input[1]")).sendKeys("C#p@ss123");
		driver.findElement(By.xpath("//body/div[@id='rootLogin']/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		 //JavascriptExecutor js = (JavascriptExecutor) driver;
	        //js.executeScript("window.scrollBy(0,1000)");
	        
		//driver.findElement(By.id("saveBTN")).click();
		//driver.findElement(By.linkText("Fotor")).click();
		driver.findElement(By.className("App-module_modal__close__XxqCy")).click();
		
		
}
}
