package baseClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;
	@BeforeMethod
	public void precCondition() {
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void postCondition() {
		//driver.close();
	}

}
