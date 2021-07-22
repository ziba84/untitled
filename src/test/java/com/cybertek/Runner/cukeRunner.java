package com.cybertek.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
       glue = "com/cybertek/StepDefinitions",
        dryRun = true,
        tags = "@wip"
)

public class cukeRunner {
}
