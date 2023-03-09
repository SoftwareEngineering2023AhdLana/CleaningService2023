import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "uses_case",
monochrome = true,

glue = {"AHDLana"}

		)
public class AcceptanceTest {

}

