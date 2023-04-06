package com.PageObjectModel.WebMathExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebMathWelcome {
	WebDriver driver;
	By General_Math = By.linkText("General Math");
	
	public WebMathWelcome(WebDriver driver){
		this.driver=driver;
	}
	
	void ClickOnGeneralMath() {
		driver.findElement(General_Math).click();
	}

}
