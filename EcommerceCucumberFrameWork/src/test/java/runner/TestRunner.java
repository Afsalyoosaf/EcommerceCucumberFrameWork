package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/feature",
    glue = "stepDefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-report.html"
    },
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Leave empty: runs your BDD tests via TestNG
}