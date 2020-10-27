package com.gurung.NaveenAutomationBBDCucumber.stepDefinitions;


import java.util.List;
import java.util.Map;

import org.apache.maven.wagon.authorization.AuthorizationException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fasterxml.jackson.databind.util.Converter;
import com.gurung.NaveenAutomationBBDCucumber.stepDefinitions.models.Animal;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;




public class LoginStepDefintion {
	public WebDriver driver;
	WebElement passwordInput;
	private Animal animal;
	
	@DataTableType
	public Animal Converter(Map<String,String> entry) {
		return new Animal(
					entry.get("animal"),
					entry.get("age")
				);
	}
	
	
	@Before
	public void doSomethingBefore() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}
	

	@After
	public void doSomethingAfter() throws Throwable {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
	
	
	
	
	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
	    driver.get("https://ui.freecrm.com//");
	    String titleString=driver.getTitle();
	    Assert.assertEquals("Cogmento CRM", titleString);
	}

	@When("user input {string}")
	public void user_input(String userName) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName);
	}

	@When("user input password")
	public void user_input_password() {
		passwordInput=driver.findElement(By.xpath("//input[@name='password']"));
		passwordInput.sendKeys("Banana12345");
		
	}

	@When("click login button")
	public void click_login_button() {
	  
	}

	@Then("user land to home page")
	public void user_land_to_home_page() {
	    
	}

	@Then("close the web")
	public void close_the_web() {
	   
	}

	@Given("go to bbc.com")
	public void go_to_bbc_com(Animal animal) {
		System.out.println("animal age is: "+animal.getAge());
		driver.get("https://www.bbc.com/");
	}

	@When("check title of home page")
	public void check_title_of_home_page() {
	   
	}
	

	
	

}
