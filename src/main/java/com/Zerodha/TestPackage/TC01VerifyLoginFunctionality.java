package com.Zerodha.TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Zerodha.POMPackage.LoginPOMClass1;

public class TC01VerifyLoginFunctionality {
	
	@Test
	public void verifyLoginZerodha() {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximised");
		
		driver.get("https://kite.zerodha.com/");
		System.out.println("URL is opened");
		
		//ScreenShotClass.takeScreenshot(driver);
		
		LoginPOMClass1 lp=new LoginPOMClass1(driver);
		lp.sendUsername();
		
		
	}

}
