package stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sam4Class {
	@When("user login to flight booking site")
	public void user_login_to_flight_booking_site() {
	   System.out.println("user - login");
	}

	@When("verify login to flight booking site is success")
	public void verify_login_to_flight_booking_site_is_success() {
	    System.out.println("verify login");
	}

	@When("user searches flight giving required details")
	public void user_searches_flight_giving_required_details() {
	   System.out.println("search flight");
	}

	@When("verify search related flight is displayed")
	public void verify_search_related_flight_is_displayed() {
	    System.out.println("verify flight details");
	}

	@When("user clicks on order button")
	public void user_clicks_on_order_button() {
	   System.out.println("click order");
	}

	@When("verify Flight details get added to cart")
	public void verify_Flight_details_get_added_to_cart() {
	   System.out.println("adding to cart");
	}

	@When("user clicks on cart")
	public void user_clicks_on_cart() {
	   System.out.println("clicks on cart");
	}

	@When("verify payment page displayed")
	public void verify_payment_page_displayed() {
	   System.out.println("payment page is displayed");
	}

	@When("user selects netbanking")
	public void user_selects_netbanking() {
	  System.out.println("user selects netbanking");
	}

	@Then("user completes payment")
	public void user_completes_payment() {
	    System.out.println("completes payment");
	}

	@Then("Verify payment success")
	public void verify_payment_success() {
	   System.out.println("verify payment");
	}

}
