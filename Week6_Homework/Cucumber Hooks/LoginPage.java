package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethod;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {
	
	@Given("Launch the Browser and navigate to the URL")
	public void launch_the_browser_and_navigate_to_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("Enter the userName with (.*)$")
	public void enter_the_user_name(String userName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(userName);
	}
	
	@When("Enter the password with (.*)$")
	public void enter_the_password(String passWord) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(passWord);
	}

	@Then("Verify the login is successful")
	public void verify_the_login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("decorativeSubmit")).click();
		String title=driver.getTitle();
		if(title.contains("TestLeaf"))
			System.out.println("Login successful");
		else
			System.out.println("Login not successful");
	}
	
	@But("Verify the login is unsuccessful")
	public void veirfy_the_login_is_unsuccessful() {
		driver.findElement(By.className("decorativeSubmit")).click();
		String title=driver.getTitle();
		if(title.contains("TestLeaf"))
			System.out.println("Login unsuccessful");
		else
			System.out.println("Login successful");
	}

}
