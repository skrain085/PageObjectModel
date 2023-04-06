package com.PageObjectModel.WebMathExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleInterest {
	WebDriver driver;
	By principal_amount = By.name("principal");
	By interest = By.name("interest");
	By interest_dropdown = By.name("interest_units");
	By desired_time = By.name("desired_time");
	By desired_time_dropdown = By.name("desired_time_units");  
	By findAmountButton = By.xpath("//input[@type='submit']");
	
	SimpleInterest(WebDriver driver) throws IOException{
		this.driver=driver;	
	}
	
	String getProperty(String propertyName) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\sasir\\OneDrive\\Desktop\\Sasi\\Workspace\\PageObjectModel\\src\\com\\PageObjectModel\\WebMathExample\\InterestInput.properties");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(propertyName);
	}
	
	void enetrprincipal() throws IOException {	
		String principal_amount_input = getProperty("principal_amount_input");
		driver.findElement(principal_amount).sendKeys(principal_amount_input);
	}
	void enterInterest() throws IOException {
		String rate_of_interest = getProperty("rate_of_interest");
		driver.findElement(interest).sendKeys(rate_of_interest);
	}
	void chooseOption_InterestDropdown() throws IOException {
		String InterestDropdown = getProperty("InterestDropdown");
		Select sel = new Select(driver.findElement(interest_dropdown));
		sel.selectByIndex(Integer.parseInt(InterestDropdown));
	}
	
	void enter_desired_time() throws IOException {
		String desired_time_input = getProperty("desired_time_input");
		driver.findElement(desired_time).sendKeys(desired_time_input);
	}
    void chooseOption_desired_time_Dropdown() throws IOException {
    	String desired_time_Dropdown = getProperty("desired_time_Dropdown");
    	Select sel = new Select(driver.findElement(desired_time_dropdown));
		sel.selectByIndex(Integer.parseInt(desired_time_Dropdown));
	}
    void calculate() {
    	
    	driver.findElement(findAmountButton).click();
    }

}
