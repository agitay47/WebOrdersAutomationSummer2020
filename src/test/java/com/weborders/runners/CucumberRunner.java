package com.weborders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //only annotions we use from Junit
@CucumberOptions(
        glue = "com/weborders/step_definitions",
        features = "src/test/resources/features",
        dryRun = false
)
public class CucumberRunner {


}
