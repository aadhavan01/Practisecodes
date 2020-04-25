package com.runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@Cucumber.Options(features="features",glue={"com.stepdefinition"})



public class TestRunner {
	
	

}
