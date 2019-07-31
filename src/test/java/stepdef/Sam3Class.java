package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sam3Class {
	@Given("user opens testmeapp login on chrome browser")
	public void user_opens_testmeapp_login_on_chrome_browser() {
	 System.out.println("login page");
	}

	@When("user typing username as {string} and password as {string}")
	public void user_typing_username_as_and_password_as(String un, String psd) {
	   System.out.println("user entered with "+un+"and "+psd);
	}

	@When("click on Login button")
	public void click_on_Login_button() {
	 System.out.println("click login"); 
	}

	@Then("validates home page appear or not")
	public void validates_home_page_appear_or_not() {
	  System.out.println("validates home screen");
	}
	@Given("display welcome message")
	public void disply(){
		System.out.println("WELCOME");
	}

}
