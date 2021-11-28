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

import com.inetbanking.utilities.ReadConfig;

			
			public class BaseClass2 {
				ReadConfig readconfig = new ReadConfig();
				public String baseURL=readconfig.getApplicationURL();
				public String username=readconfig.getUsername();
				public String password=readconfig.getPassword();
				public static WebDriver driver;
				public static Logger Logger;
				
		
				@Parameters("browser")
				@BeforeClass
				public void setup(String br)
				{
				Logger = Logger.getLogger("ebanking");
				PropertyConfigurator.configure("Log4j.properties");
				
				
				if(br.equals("chrome"))
						{
					System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
					driver = new ChromeDriver();
						}
				else if(br.equals("firefox"))
				{
					System.setProperty("webdriver.firefox.driver",  readconfig.getFireFoxPath());
					driver = new FirefoxDriver();
				}
				else if(br.equals("ie"))
				{
					System.setProperty("webdriver.ie,driver",readconfig.getIEPath());
					driver= new FirefoxDriver();
				}
				driver.get(baseURL);
				}
				@AfterClass
				public void tearDown()
				{
				driver.quit();
				}
				}
		
			

