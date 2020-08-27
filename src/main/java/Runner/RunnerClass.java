package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefiles/Opengoogle.feature",
                 glue = "stepDefinitions",
                 plugin = {"html:report/WebReport","json:report/jsonreport.json","junit:report/xmlreport.xml"}) /*plugin used to generate report*/
public class RunnerClass {
}
