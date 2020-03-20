package bdd.tax.calculation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict      = true,
        features    = "classpath:features/tax-calculation.feature",
        plugin      = {
                "pretty",
                "json:target/json/testreport.json",
                "html:target/html/native-cucumber-reporting.html",
                "junit:target/junit/testreport.xml"
        },
        glue        = "bdd.tax.calculation")
public class TestRunner {
}
