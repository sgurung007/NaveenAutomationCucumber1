package com.gurung.NaveenAutomationBBDCucumber.stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*
;

public class homeDepotStepDefinition {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition(List<String> animals ) {
	    System.out.println("suraj animals: "+animals.get(0));
	    System.out.println("suraj animals: "+animals.get(1));
	    System.out.println("suraj animals: "+animals.get(2));
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	  
	}

	@When("I complete action")
	public void i_complete_action() {
	 
	}

	@When("some other action")
	public void some_other_action() {
	  
	}

	@When("yet another action")
	public void yet_another_action() {
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	   
	}

	@Then("check more outcomes")
	public void check_more_outcomes(DataTable names) {
	   for(Map<Object, Object> data:names.asMaps(String.class, String.class)) {
		   System.out.println("first name is: "+data.get("firstName")+" & last name is: "+data.get("lastName"));
	   }
	   
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	   
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	  
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    
	}
}
