package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import baseClass.ProjectSpecificMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends ProjectSpecificMethod{
@Before
public void precCondition() {
	driver.get("http://leaftaps.com/opentaps/control/main");    
}
@After
public void postCondition() {
	driver.close();
}
}