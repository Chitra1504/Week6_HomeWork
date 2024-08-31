package stepDef;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod {
	@When("click on Crmsfa button")
	public void click_on_crmsfa_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("click on Leads button")
	public void click_on_leads_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("click on CreateLead button")
	public void click_on_create_lead_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("enter the company name as {string}")
	public void enter_the_comapny_name_as(String cName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@When("enter the first name as {string}")
	public void enter_the_first_name_as_first_name(String fName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@When("enter the last name as {string}")
	public void enter_the_last_name_as_last_name(String lName) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@When("click on Submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("verify the create lead page")
	public void verify_the_create_lead_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Lead")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}


}
