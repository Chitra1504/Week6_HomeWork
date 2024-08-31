package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClass.SalesforceMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceAccount extends SalesforceMethod {
	public static WebDriverWait wait;

	@When("Enter the sfusername as (.*)$")
	public void enter_the_username_as_sfusename(String uname) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@When("Enter the sfpassword as (.*)$")
	public void enter_the_password_as_testleaf(String pword) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(pword);
	}

	@When("click on the LogIn button")
	public void click_on_the_log_in_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Login")).click();
	}

	@Then("verify the login is succesful")
	public void verify_the_login_is_succesful() {
	    // Write code here that turns the phrase above into concrete actions
		String expectedURL="Home | Salesforce";
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(expectedURL));
		String actualURL=driver.getTitle();   
		Assert.assertEquals(actualURL,expectedURL);
	}

	@When("click on toggle menu button from left corner")
	public void click_on_toggle_menu_button_from_left_corner() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@title='App Launcher']")).click();
	}

	@When("click View All")
	public void click_view_all() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@aria-label='View All Applications']")).click();
	}

	@When("click Sales from App Launcher")
	public void click_sales_from_app_launcher() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[text()='Sales']")).click();
	}

	@When("click on Accounts tab")
	public void click_on_accounts_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Accounts']")));
		driver.findElement(By.xpath("//a[@title='Accounts']/parent::one-app-nav-bar-item-root")).click();
	}

	@When("click on New button")
	public void click_on_new_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[text()='New']")).click();
	}

	@Then("verify the New Account creation form is shown")
	public void verify_the_new_account_creation_form_is_shown() {
	    // Write code here that turns the phrase above into concrete actions
	    String expectedText="New Account";
	    String actualText=driver.findElement(By.xpath("//div[@class='slds-modal__header']/h2")).getText();
	    Assert.assertEquals(actualText,expectedText);
	}

	@When("Enter Account Name as {string}")
	public void enter_account_name_as(String name) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//label[text()='Account Name']/following-sibling::div/input")).sendKeys(name);
	}

	@When("Select ownership as (.*)$")
	public void select_ownership_as(String ownerShip) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement owner=driver.findElement(By.xpath("//label[text()='Ownership']/following::button[@role='combobox']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", owner);
	    if(ownerShip.equals("Public"))
	    driver.findElement(By.xpath("//*[text()='Public']")).click();
	}

	@When("click Save")
	public void click_save() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("verify the Account is created with (.*)$")
	public void verify_the_account_is_created(String name) {
	    // Write code here that turns the phrase above into concrete actions
	   String accountName= driver.findElement(By.xpath("//*[@slot='primaryField']")).getText();
	   if(name.equals(accountName))
		   System.out.println("The account is created successfully");
	   else
		   System.out.println("The account is not created");
	}

}
