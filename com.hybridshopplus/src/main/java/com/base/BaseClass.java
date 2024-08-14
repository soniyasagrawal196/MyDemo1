package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utilities.PropertiesUtils;

public class BaseClass {
	public static WebDriver driver= null;
	public static ExtentReports report= null;
	public static ExtentSparkReporter spark= null;
	public static ExtentTest test= null;
    public static Logger log= Logger.getLogger("BaseClass");
		public static void initialization()
		{
			log.info("Reading Property File For Browser");
			System.out.println("Reading Property File For Browser");
			String BrowserName= PropertiesUtils.readproperty("browser");
			if(BrowserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "chromedriver126.exe");
				driver= new ChromeDriver();
			}
			if(BrowserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.firefox.driver","gecodriver.exe");
				driver= new FirefoxDriver();
			}
			if(BrowserName.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
				driver= new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get(PropertiesUtils.readproperty("url"));
		
	}
		public void reportInit()
		{
			report= new ExtentReports();
			spark= new ExtentSparkReporter(System.getProperty("user.dir")+"/target/ExtentReport.html");//provide path
			report.attachReporter(spark);//To connect Report And Spark
		}
        public static void main(String[] args) {
			initialization();
		}
}
