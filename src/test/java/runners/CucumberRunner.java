package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"}, glue = {"steps"}
        , plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt"},
        monochrome = true)
public class CucumberRunner {
}
