package runner;

import baseClass.SalesforceMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/SalesforceStaticData.feature",glue= {"stepDef"},monochrome=true,publish=true)
public class SalesforceUpdateRunner extends SalesforceMethod {

}
