package com.nopcommerce.demo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/java/resources/featurefile/RegisterPage.feature",
        glue = "com/nopcommerce/demo",
        tags= "@regression",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)

public class RegisterPageRegressionRunner
{

}
