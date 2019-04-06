package stepDefinition;
import assignment.Amazon;

import assignment.Swiftcodes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class TestSteps {
	Amazon amazonhomepage = new Amazon();
	Swiftcodes bankswiftcodes = new Swiftcodes();
			
	@Given("^Enter site url$")
	public void Enter_site_url() throws Exception {
		amazonhomepage.launchAmazon();
	}

	@Then("^Home page is displayed$")
	public void Home_page_is_displayed() throws Exception{
		System.out.println("Amazon home page is displayed");
	}
	@Given("^Products are displayed$")
	public void Products_are_displayed () throws Exception{
		System.out.println("Products are displayed on Home page");
	}

	@Then("^Validate list of product displayed and print$")
	public void Validate_list_of_product_displayed_and_print() throws Exception{
		amazonhomepage.getProductNames();
	}
	
	@Given("^Enter site url for SwiftCodes$")
	public void Enter_site_url_for_SwiftCodes() throws Exception{
		bankswiftcodes.launchsite();
	}

	@When("^Bank Details are displayed$")
	public void Bank_Details_are_displayed() throws Exception{
		System.out.println("Bank details are displayed with Swift codes");
	}

	@Then("^Validate Bank names and Swift Codes and print$")
	public void Validate_Bank_names_and_Swift_Codes_and_print() throws Exception{
		bankswiftcodes.getbanknames();
	}


}
