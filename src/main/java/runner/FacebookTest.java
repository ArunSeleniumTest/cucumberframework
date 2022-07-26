package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\appfeature\\background.feature", glue = { "appdefinition","hooks"},
        // dryRun = true,
        plugin="pretty",
        publish=true,

		monochrome = true
                 
                 )

public class FacebookTest {
	
}
