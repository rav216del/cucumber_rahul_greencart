package utilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Basetest {
	private static WebDriver driver;
	
	public Basetest(){}
	public  WebDriver getDriver() {
		return driver;
	}
	
	public  WebDriver callwebdriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\global.properties");
		prop.load(fis);
		String Browser=prop.getProperty("browser");
		String qaurl=prop.getProperty("url");
		String qaurl1=prop.getProperty("url1");
		
		
		if(driver==null) {
			
			if(Browser.equalsIgnoreCase("chrome"))
			{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
			}
			
			
			if(Browser.equalsIgnoreCase("firefox"))
			{
		System.setProperty("webdriver.gecko.driver", "D:\\driver\\firefoxdriver.exe");
		driver=new FirefoxDriver();
			}
			
			
			if(Browser.equalsIgnoreCase("safari"))
			{
		System.setProperty("webdriver.safari.driver", "D:\\driver\\safaridriver.exe");
		driver=new SafariDriver();
			}
			driver.get(qaurl1);
		//driver.get(qaurl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		driver.manage().window().maximize();
		}
		return driver;
	
	}
	


}
