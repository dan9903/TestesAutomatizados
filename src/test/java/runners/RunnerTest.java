package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
    "html:target/cucumber-report" }, features = "src/test/java/resources/features", /* tags = "@dropdown", */ glue = "stepsDefinitions", snippets = SnippetType.CAMELCASE, monochrome = false, dryRun = false)
public class RunnerTest {

}