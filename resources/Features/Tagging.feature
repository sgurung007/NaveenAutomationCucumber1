#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@FunctionalTest
Feature: Free CRM application testing
	This is the documenation about this feature.

  @SmokeTest @Regression 
  Scenario: Login with correct username and correct password
    Given This is a valid login test
   
	@Regression
	Scenario: login with incorrect username and correct password
		Given This is a contact test case
	
	@SmokeTest
	Scenario: Create a deal
		Given This is a deal test case 
		
	@Regression 
	Scenario: Create a tasks
		Given This is a tasks test case
		
	@SmokeTest @Regression 
	Scenario: Create a case
		Given This is case test case
		
	@Regression 
	Scenario: Verify left panel links
		Given clicking on left panel links
		
		
	@Regression 	
	Scenario: Search a deal
		Given This is a search deal test
	
	
	@SmokeTest @Regression @End2End
	Scenario: Search a case
		Given This is a seach a case tests
		
	@SmokeTest
	Scenario: Search a call
		Given This is a search a case call
		
	@End2End
	Scenario: Search a email 
		Given This is a serach a email case
	
	@End2End	
	Scenario: validate a report
		Given This is a report test
	
	@End2End
	Scenario: Application log out 
		Given This is a log out test
		
		
		
