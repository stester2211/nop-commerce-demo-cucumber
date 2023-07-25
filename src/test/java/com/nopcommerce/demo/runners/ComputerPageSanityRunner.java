package com.nopcommerce.demo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/java/resources/featurefile/ComputerPage.feature",
        glue = "com/nopcommerce/demo",
        tags= "@sanity",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)

public class ComputerPageSanityRunner
{

}
