package com.PageObjectModel.WebMathExample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMathMain {

	public static void main(String[] args) {
		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			driver.get("https://www.webmath.com/");
			
			WebMathWelcome welcome = new WebMathWelcome(driver);
			welcome.ClickOnGeneralMath();
			Thread.sleep(2000);
			
			WebMathGeneralMath generalMath = new WebMathGeneralMath(driver);
			generalMath.chooseOption();
			Thread.sleep(2000);
			
			SimpleInterest calculate_interest = new SimpleInterest(driver);
			calculate_interest.enetrprincipal();
			Thread.sleep(2000);
			calculate_interest.enterInterest();
			Thread.sleep(2000);
			calculate_interest.chooseOption_InterestDropdown();
			Thread.sleep(2000);
			calculate_interest.enter_desired_time();
			Thread.sleep(2000);
			calculate_interest.chooseOption_desired_time_Dropdown();
			Thread.sleep(2000);
			calculate_interest.calculate();
			Thread.sleep(2000);
			driver.close();
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}

	}

}
