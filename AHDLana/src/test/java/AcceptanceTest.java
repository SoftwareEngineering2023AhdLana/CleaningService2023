import org.junit.runner.RunWith;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "uses_case",
monochrome=true,
//snippets=SnippetType.CAMELCASE,
//plugin= {"html: target/cucumber.html"},
glue = {"AHDLana"}

		)
public class AcceptanceTest {

}

