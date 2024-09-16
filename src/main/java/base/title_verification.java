package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.service.DriverFinder;

import dev.failsafe.internal.util.Assert;
import junit.framework.Test;

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
	
	
	    @Test(dependsOnMethods = {"com.example.wordpress.LoginTest.testLogin"})
	    public void testPluginStatus() {
	       
	        DriverFinder.get("http://your-wordpress-site.com/wp-admin/plugins.php");

	        // Check if the WP Dark Mode plugin is active
	        WebElement pluginStatus;
			try {
				pluginStatus = WebDriver.findElement(By.xpath("//tr[.//a[contains(text(), 'WP Dark Mode')]]//span[contains(text(), 'Active')]"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Assert.notNull(pluginStatus, "WP Dark Mode plugin is not active!");
	    }

	    @AfterClass
	    public void tearDown() {
	        Object driver;
			if (driver != null) {
	            ((WebDriver) driver).quit();
	        }
	    }
	}	
	
			
}
