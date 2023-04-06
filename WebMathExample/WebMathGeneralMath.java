package com.PageObjectModel.WebMathExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebMathGeneralMath{
	
	WebDriver driver;
       By dropdown = By.xpath("//select[@name='topicItem']");
       
       WebMathGeneralMath(WebDriver driver){
    	   this.driver=driver;
       }
       	       
	   void chooseOption() throws IOException {
	    	   
	   FileInputStream fis = new FileInputStream("C:\\Users\\sasir\\OneDrive\\Desktop\\Sasi\\Workspace\\PageObjectModel\\src\\com\\PageObjectModel\\WebMathExample\\generalMathInput.properties");
	   Properties p = new Properties();
	   p.load(fis);
	   	    
	   String dropdown_value = p.getProperty("dropdown_value");
	    	   
	   Select sel = new Select(driver.findElement(dropdown));
	   sel.selectByVisibleText(dropdown_value);
	    	   
	   }
       
       }
       

