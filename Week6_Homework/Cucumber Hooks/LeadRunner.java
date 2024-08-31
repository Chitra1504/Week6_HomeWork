package runner;

import baseClass.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/features/CreateLeadTL.feature","src/test/java/features/EditLeadTL.feature","src/test/java/features/DeleteTL.feature"},
glue={"stepDef","hooks"},monochrome=true, publish=true)
public class LeadRunner extends ProjectSpecificMethod {

}
