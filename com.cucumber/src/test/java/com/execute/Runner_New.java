package com.execute;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
glue="stepDefinition",
plugin= {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml"},tags="@smoke")

//

//,tags ="@smoke
public class Runner_New {

}
