package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\IQGURUAutomationBranch\\HrmsProject\\src\\test\\resources\\Features",
glue="Steps",
tags="@Test2",
monochrome=true,
dryRun=true
//plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class JunitRunner {
	

}
