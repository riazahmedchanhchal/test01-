package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import dev.failsafe.internal.util.Assert;

@SuppressWarnings("unused")
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
	
	public void testLogin() {
        RemoteWebDriver driver = null;
		driver.get("http://your-wordpress-site.com/wp-login.php");

        WebElement usernameField = driver.findElement(By.id("user_login"));
        WebElement passwordField = driver.findElement(By.id("user_pass"));
        WebElement loginButton = driver.findElement(By.id("wp-submit"));

        usernameField.sendKeys("your-username");
        passwordField.sendKeys("your-password");
        loginButton.click();

        // Check if login was successful
        WebElement dashboard = driver.findElement(By.id("wpadminbar"));
     
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
    }
}
	

