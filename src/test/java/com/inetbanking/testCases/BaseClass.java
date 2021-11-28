package com.inetbanking.testCases;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

		import java.io.File;
		import java.io.IOException;
		import java.util.concurrent.TimeUnit;

		import org.apache.commons.io.FileUtils;
		import org.apache.commons.lang3.RandomStringUtils;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.ie.InternetExplorerDriver;
		import org.testng.annotations.AfterClass;
		import org.testng.annotations.BeforeClass;
		import org.testng.annotations.Parameters;

		
		public class BaseClass {

			public String baseURL="https://demo.guru99.com/v4/";
			public String username="mngr370129";
			public String password="qUqaqyj";
			public static WebDriver driver;
public static Logger Logger;
			
			
			@BeforeClass
			public void setup()
			{
				
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			
			driver = new ChromeDriver();

			Logger = Logger.getLogger("ebanking");
			PropertyConfigurator.configure("log4j.properties");
			
			
			}
			@AfterClass
			public void tearDown()
			{
			driver.quit();
			}
			}
	
		

