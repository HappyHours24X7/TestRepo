package Amazon;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchProduct {
	
	static String driverPath = "D:\\Softwares\\geckodriver-v0.31.0-win64\\geckodriver.exe";
	WebDriver driver;
	@Test
	public void loginOpenCart() throws InterruptedException
	{	
		System.setProperty("webdriver.gecko.driver",driverPath);			
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kellogs muesli ");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(driver.getTitle());
				
		driver.close();
	}
}
