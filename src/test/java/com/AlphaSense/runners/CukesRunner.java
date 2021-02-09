package com.AlphaSense.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //After every run cucumber will generate a json report called cucumber.json in target folder
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue = "com/AlphaSense/step_definitions",
        tags = "@smoke",
        dryRun = false


        )
public class CukesRunner {
}
