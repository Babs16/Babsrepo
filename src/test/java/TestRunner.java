import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = "StepDefinitions",
        format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucmber.xml"},
        monochrome = true

)

public class TestRunner {




}
