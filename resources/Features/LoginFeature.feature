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
@tag
Feature: Free CRM Login Feature
  This is the description of the feature...

  @tag1
  Scenario Outline: Free CRM login test scenario
    Given user is already on login page
    When user input "<userName>"
    And user input password
    And click login button
    Then user land to home page
    And close the web
    
    Examples:
    |userName|
    |sgrg007@gmail.com|
    
    
   
    @tag2
    Scenario: Check bbc homepage
    Given go to bbc.com
    |animal	|age	|
    |dog		|dogAge	|
    When check title of home page
    Then close the web

    