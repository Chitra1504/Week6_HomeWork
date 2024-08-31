package baseClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class SalesforceMethod extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	@BeforeMethod
	public void precCondition() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://login.salesforce.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
