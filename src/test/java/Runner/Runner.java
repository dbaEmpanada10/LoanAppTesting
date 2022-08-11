package Runner;

import StepDefinitions.DriverFactory;
import courgette.api.*;
import courgette.api.junit.Courgette;



import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 1,
        runLevel = CourgetteRunLevel.SCENARIO,
        rerunFailedScenarios = true,
        rerunAttempts = 1,
        testOutput = CourgetteTestOutput.CONSOLE,
        reportTitle = "Courgette-JVM Example",
        reportTargetDir = "build",
        environmentInfo = "browser=chrome; git_branch=master",
        cucumberOptions = @CucumberOptions(
            features = "src/test/resources/Features",
            glue = "StepDefinitions",
            tags = "@Authentication",
            publish = true,
            plugin = {"json:target/cucumber-reports/StageZeroPickle.json","html:target/cucumber-reports/Cucumber-test-results.html"}
        )
)
public class Runner {
}
