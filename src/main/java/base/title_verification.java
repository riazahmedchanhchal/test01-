package base;

import org.openqa.selenium.firefox.FirefoxDriver;

public class title_verification {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "\"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe\"");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://site-one.local/cart/");
		if(driver.getTitle().equals("Cart"))
		{
			System.out.print("Title is correct");
		}
		else
		{
		    System.out.print("Title is incorrect");	
		
		}
		
	}
			
}
