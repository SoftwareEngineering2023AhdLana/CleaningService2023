package cleaningServiceTest;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "cases",monochrome= true, 
snippets = SnippetType.CAMELCASE, 
glue = {"cleaningServiceTest"},	
plugin = {"html:target/cucumber/wikipedia.html"})

public class acceptanceTest {
	
}
