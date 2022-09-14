package com.Zerodha.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass1 {
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"userid\"]")
	private WebElement username;
	
	public void sendUsername() {
		username.sendKeys("NVH158");
	}
	
	public LoginPOMClass1(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		
	}
	
}
