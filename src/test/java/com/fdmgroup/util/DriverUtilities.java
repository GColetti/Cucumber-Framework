package com.fdmgroup.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtilities {
	private static DriverUtilities driverUtilities; // 1-> private static instance of the class
	private WebDriver driver;

	private DriverUtilities()// 2->private constructor
	{

	}

	public static DriverUtilities getInstance()// 3.public static getInstance()
	{
		if (driverUtilities == null) {
			driverUtilities = new DriverUtilities();
		}
		return driverUtilities;
	}
	
	public WebDriver getDriver()
	{
		if(driver == null)
		{
		createDriver();
		}
		return driver;
	}

	private void createDriver() {
		String driverName = getDriverName();

		switch (driverName) {
		case "google chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			this.driver = new ChromeDriver();
			break;

		case "firefox":

			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
			break;
		default:
			System.out.println("Brower name in Invalid!");
			break;
		}
	}

	private String getDriverName() {
		// TODO Auto-generated method stub
		Properties config = new Properties();
		String driverName = "";
		try {
			config.load(new FileInputStream("src/test/resources/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String key : config.stringPropertyNames()) {

			if (key.equals("Browser")) {
				driverName = config.getProperty(key);
			}

		}

		return driverName;
	}

//	public static void main(String[] args) {
//		DriverUtilities obj1 = DriverUtilities.getInstance();
//		System.out.println("first object: "+obj1);
//		DriverUtilities obj2 = DriverUtilities.getInstance();
//		System.out.println("second object: "+obj2);
//		
//	}

}
