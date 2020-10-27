package com.gurung.NaveenAutomationBBDCucumber.runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features ={"resources/Features/Tagging.feature"}	//the path of the feature file
	,glue= {"com.gurung.NaveenAutomationBBDCucumber.stepDefinitions.functional"}	//the path of the stepDefinitons
	,plugin= {"pretty","html:target/test-output.html","summary"}
	,monochrome = true
	,dryRun = true
	,tags="@FunctionalTest and not @SmokeTest"
	

)
public class TestRunnerFeature {

}
