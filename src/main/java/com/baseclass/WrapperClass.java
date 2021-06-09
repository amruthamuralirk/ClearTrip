package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperClass {
	public static WebDriver driver;
	public void applaunch(String browser,String url) {
		
		try {
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","D:\\amrutha official\\selenium\\SELENIUM SETUPFILE-20200803T155912Z-001\\SELENIUM SETUPFILE\\Programs new\\BMW(1)\\BMW\\src\\main\\resources\\chromedriver.exe");
                         ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
			driver=new ChromeDriver(options);
			
		
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\AMRUTHA\\eclipse-workspace\\Goindigo\\Resources\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.out.println("BROWSER NOT LAUNCHED");
		}}
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(path);
        FileUtils.copyFile(SrcFile, DestFile);

	}
		
		public void Quit() {
		   driver.quit();
		}
		
		
	}


