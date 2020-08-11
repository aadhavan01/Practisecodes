package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.core.cli.Main;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"com.stepDefinition"})

public class TestRunnerNew {
	
	

}

