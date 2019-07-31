package stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/samplefolder/sam4.feature",
				//glue="stepdef",
				//plugin="html:target\\htmlreport")
				//plugin="json:target\\jsonreport.json")
				//tags={"@dryrun","@regression"}, //AND case
				 // tags={"@dryrun,@regression"}, //OR case
				tags={"~@dryrun"}, //ignore
				plugin="junit:target\\xmlreport.xml")
public class RunnerClass {

}
 