# test01-
# WordPress Automation Test Suite
This is an automation test suite for WordPress using Selenium and Java. The suite includes tests for logging into a WordPress site and verifying if the "WP Dark Mode" plugin is active.
## Requirements
- Java JDK 8 
- Maven project
- gecodriver 
- Eclipes

**##Create a New Maven Project**

**#Add Dependencies in pom.xml**
<project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="https://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>SQA</groupId>
  <artifactId>SQA</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies>
  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.24.0</version>
</dependency>

  
  
  </dependencies>
</project>

**#Implement Test Cases**
Package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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
        driver.get("http://site-one.local/cart/");

        WebElement usernameField = driver.findElement(By.id("user_login"));
        WebElement passwordField = driver.findElement(By.id("user_pass"));
        WebElement loginButton = driver.findElement(By.id("wp-submit"));

        usernameField.sendKeys("your-username");
        passwordField.sendKeys("your-password");
        loginButton.click();

        // Check if login was successful
        WebElement dashboard = driver.findElement(By.id("wpadminbar"));
        Assert.assertTrue(dashboard.isDisplayed(), "Login failed!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

#For Check the title

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

#For Maximize the website 


package base;

import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "\"C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe\"");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://site-one.local/wp-login.php?redirect_to=http%3A%2F%2Fsite-one.local%2Fwp-admin%2F&reauth=1");
		driver.manage().window().maximize();
		

	}

}


