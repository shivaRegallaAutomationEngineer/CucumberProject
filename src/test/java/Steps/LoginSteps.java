package Steps;

import org.openqa.selenium.WebDriver;

import BaseClass.Base;
import Pages.LoginPageElements;
import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
static WebDriver driver;
		@Given("User Navigates to the login page")
		public void user_navigates_to_the_login_page() {
		Base.setUp();
		}
      @When("User Enters the valid username and valid password")
		public void user_enters_the_valid_username_and_valid_password() {
    	  CommonMethods.  wait(5);
    	  
    	  LoginPageElements loginPage=new LoginPageElements();
  		CommonMethods.sendText(loginPage.userName, "Admin");
  		CommonMethods.sendText(loginPage.password,"admin123");
  		
		}
		@When("User Clicks on the login button")
		public void user_clicks_on_the_login_button() {
			 LoginPageElements loginPage=new LoginPageElements();
			CommonMethods.click(loginPage.loginButton);
		}
		@Then("User Successfully login into the application")
		public void user_successfully_login_into_the_application() {
			System.out.println("login successfully");
		  
		}
		
			@When("User Enters the valid {string} and valid {string}")
			public void user_enters_the_valid_and_valid(String username, String password) {
				 CommonMethods.  wait(5);
		    	  
		    	  LoginPageElements loginPage=new LoginPageElements();
		  		CommonMethods.sendText(loginPage.userName, username);
		  		CommonMethods.sendText(loginPage.password,password);
		  		
			}

		

				@Then("I see {string}")
				public void i_see(String string) {
				    
				}






}
