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
