package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;

		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\aruna\\eclipse-workspace\\MyPro\\src\\testing\\config.Properties");

		prop.load(ip);

		System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");

		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get(prop.getProperty("Url"));
			driver.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("loginEmail"));
		driver.findElement(By.name("loginPassword")).sendKeys("plassword");
		driver.findElement(By.name("loginButton")).click();
		System.out.println("HI");
	
}}