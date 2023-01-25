package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/nopCommerce/features",
        glue = "nopCommerce.stepDefinitions",
        //dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber_nopCommerce.json"},
        snippets = SnippetType.CAMELCASE,
        tags = {"@customer"})


public class NopCommerceTestRunner {
}
