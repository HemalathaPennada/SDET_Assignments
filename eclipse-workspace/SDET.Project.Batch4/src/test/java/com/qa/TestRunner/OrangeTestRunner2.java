package com.qa.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\PennadaH\\eclipse-workspace\\SDET.Project.Batch4\\src\\test\\java\\com\\qa\\features\\OrangeHRMsecond.feature",
glue="com.qa.stepdefinition"
,strict=true,
monochrome=true,
format= {"pretty","html:test-output"},
tags= {"@smoke,@Regression"}


)

public class OrangeTestRunner2 {

	
}
