package base;

import org.openqa.selenium.firefox.FirefoxDriver;

public class navigationtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "\"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe\"");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://site-one.local/cart/");
		driver.navigate().to("http://site-one.local/shop/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
	}
	
	
	
}
