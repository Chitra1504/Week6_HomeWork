package stepDef;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends ProjectSpecificMethod {
	public String leadID;
	@When("store the leadId in variable")
	public void store_the_lead_id_in_variable() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	}

	@When("click on Delete button")
	public void click_on_delete_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Delete")).click();
	}

	@When("enter the leadId in the Name and ID tab")
	public void enter_the_lead_id_in_the_name_and_id_tab() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@Then("verify the lead is deleted")
	public void verify_the_lead_is_deleted() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead is not deleted ");
		}
	}

}
