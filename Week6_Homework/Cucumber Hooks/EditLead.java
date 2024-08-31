package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends ProjectSpecificMethod {

	@When("click on FindLeads link")
	public void click_on_find_leads_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Enter the phone no as (.*)$")
	public void enter_the_phone_no_as(String phno) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	}

	@When("click FindLeads button")
	public void click_find_leads_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("click on first record shown in results")
	public void click_on_first_record_shown_in_results() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("click on Edit button")
	public void click_on_edit_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Edit")).click();
	}

	@When("update leadCompanyName with (.*)$")
	public void update_lead_company_name(String compname) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(compname);
	}

	@When("click Update button")
	public void click_update_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("verify the companyName is updated successfully")
	public void verify_the_company_name_is_updated_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TCS")) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}
	}


}
