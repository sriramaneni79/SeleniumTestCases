package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.amd64.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium {

	public static void main(String[] args) {
		
		
		  System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		 
		  //System.setProperty("Webdriver.gecko.driver",
		 // "C:/Users/aruna/Desktop/Selenium/geckodriver.exe");
		  
		  WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");

		
		
	

	}

}
