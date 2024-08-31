package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClass.SalesforceMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceUpdateAccount extends SalesforceMethod {
	public static WebDriverWait wait;
	public static Actions action;
	@When("search for the account using unique account name")
	public void search_for_the_account_using_unique_account_name() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	    WebElement search=driver.findElement(By.xpath("//*[@name='Account-search-input']"));
	    search.sendKeys("Chitra",Keys.ENTER);
	    search.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	}

	@When("click the dropdown next to the account and select Edit")
	public void click_the_dropdown_next_to_the_account_and_select_edit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement dropDown=driver.findElement(By.xpath("//div[@data-aura-class='forceVirtualAction']"));
	    wait.until(ExpectedConditions.elementToBeClickable(dropDown));
	    action=new Actions(driver);
	    action.click(dropDown).perform();
	    WebElement edit=driver.findElement(By.xpath("//a/div[text()='Edit']"));
	    action.click(edit).perform();
	}

	@Then("verify the Edit Account form is shown")
	public void verify_the_edit_account_form_is_shown() {
	    // Write code here that turns the phrase above into concrete actions
		String expectedText="Edit Chitra";
	    String actualText=driver.findElement(By.xpath("//div[@class='slds-modal__header']/h2")).getText();
	    Assert.assertEquals(actualText,expectedText);
	}

	@When("select Type as (.*)$")
	public void select_type_as(String partner) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement type=driver.findElement(By.xpath("//label[text()='Type']/following::button[@role='combobox']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", type);
	    if(partner.equals("Technology Partner"))
	    driver.findElement(By.xpath("//*[text()='Technology Partner']")).click();
	}

	@When("select Industry as (.*)$")
	public void select_industry_as(String industry) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement indus=driver.findElement(By.xpath("//label[text()='Industry']/following::button[@role='combobox']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", indus);
	    if(industry.equals("Healthcare")) {
	    WebElement option=driver.findElement(By.xpath("//*[text()='Healthcare']"));
	    js.executeScript("arguments[0].scrollIntoView(true);", option);	
	    option.click();
	    }
	}

	@When("enter the billing street in billing address as {string}")
	public void enter_the_billing_street_in_billing_address_as(String street) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement bstreet=driver.findElement(By.xpath("//*[@name='street']"));
	    bstreet.sendKeys(street);
	}

	@When("enter the billing city in billing address as {string}")
	public void enter_the_billing_city_in_billing_address_as(String city) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement bcity=driver.findElement(By.xpath("//*[@name='city']"));
	    bcity.sendKeys(city);
	}

	@When("enter the billing postal code in billing address as {string}")
	public void enter_the_billing_postal_code_in_billing_address_as(String code) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement bpcode=driver.findElement(By.xpath("//*[@name='postalCode']"));
	    bpcode.sendKeys(code);
	}

	@When("enter the billing state in billing address as {string}")
	public void enter_the_billing_state_in_billing_address_as(String state) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement bstate=driver.findElement(By.xpath("//*[@name='province']"));
	    bstate.sendKeys(state);
	}

	@When("enter the billing country in billing address as {string}")
	public void enter_the_billing_country_in_billing_address_as(String country) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement bcountry=driver.findElement(By.xpath("//*[@name='country']"));
	    bcountry.sendKeys(country);
	}

	@When("enter the shipping street in shipping address as {string}")
	public void enter_the_shipping_street_in_shipping_address_as(String street) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement sstreet=driver.findElement(By.xpath("(//*[@name='street'])[2]"));
	    sstreet.sendKeys(street);
	}

	@When("enter the shipping city in shipping address as {string}")
	public void enter_the_shipping_city_in_shipping_address_as(String city) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement scity=driver.findElement(By.xpath("(//*[@name='city'])[2]"));
	    scity.sendKeys(city);
	}

	@When("enter the shipping postal code in shipping address as {string}")
	public void enter_the_shipping_postal_code_in_shipping_address_as(String code) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement spcode=driver.findElement(By.xpath("(//*[@name='postalCode'])[2]"));
	    spcode.sendKeys(code);
	}

	@When("enter the shipping state in shipping address as {string}")
	public void enter_the_shipping_state_in_shipping_address_as(String state) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement sstate=driver.findElement(By.xpath("(//*[@name='province'])[2]"));
	    sstate.sendKeys(state);
	}

	@When("enter the shipping country in shipping address as {string}")
	public void enter_the_shipping_country_in_shipping_address_as(String country) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement scountry=driver.findElement(By.xpath("(//*[@name='country'])[2]"));
	    scountry.sendKeys(country);
	}

	@When("select the customer priority as (.*)$")
	public void select_the_customer_priority_as(String priority) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement pri=driver.findElement(By.xpath("//label[text()='Customer Priority']/following::button[@role='combobox']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", pri);
	    if(priority.equals("Low"))
	    driver.findElement(By.xpath("//*[text()='Low']")).click();
	}

	@When("select the SLA as (.*)$")
	public void select_the_sla_as(String sla) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement sladropdown=driver.findElement(By.xpath("//label[text()='SLA']/following::button[@role='combobox']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", sladropdown);
	    if(sla.equals("Silver"))
	    driver.findElement(By.xpath("//*[text()='Silver']")).click();
	}

	@When("select the Active as (.*)$")
	public void select_the_active_as(String active) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement flag=driver.findElement(By.xpath("//label[text()='Active']/following::button[@role='combobox']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", flag);
	    if(active.equals("No"))
	    driver.findElement(By.xpath("//*[text()='No']")).click();	
	    }

	@When("enter the Phone as {string}")
	public void enter_the_phone_as(String no) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement phone=driver.findElement(By.xpath("//*[@name='Phone']"));
	    phone.sendKeys(no);
	}

	@When("select the Upsell Opportunity as (.*)$")
	public void select_the_upsell_opportunity_as(String opportunity) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement upsell=driver.findElement(By.xpath("//label[text()='Upsell Opportunity']/following::button[@role='combobox']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", upsell);
	    if(opportunity.equals("No"))
	    driver.findElement(By.xpath("//*[text()='No']")).click();	
	}

	@Then("verify the phone number is {string}")
	public void verify_the_phone_number(String phno) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	    WebElement phone=driver.findElement(By.xpath("//tbody/tr/td[4]/span/span[@dir='ltr']"));
	    String actualno=phone.getText();
	    Assert.assertEquals(actualno, phno);
	}

	

}
