package com.execute;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(features="Features",
glue="stepDefinition",
plugin= {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml"},tags ="@smoke")

public class Runner_NewWith_TestNG extends AbstractTestNGCucumberTests {

}
