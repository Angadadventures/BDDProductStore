package com.cg.product.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features" , glue="com.cg.product.stepdefinition")
public class TestRunner {

}
