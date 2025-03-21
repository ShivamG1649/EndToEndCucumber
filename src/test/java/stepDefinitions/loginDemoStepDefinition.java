package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginDemoStepDefinition {


     WebDriver driver;
    @Given("I open application url")
    public void i_open_application_url() {

         driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         System.out.println("opening application URL");

    }
    @When("I  user enters valid username")
    public void i_user_enters_valid_username() {
        System.out.println("Enter valid user name");
    }
    @When("I user enters valid password")
    public void i_user_enters_valid_password() {
        System.out.println("Enter valid password");
    }
    @When("I  user click on login button")
    public void i_user_click_on_login_button() {
        System.out.println("Click on login button");
    }
    @Then("I verify that user logged in successfully in application")
    public void i_verify_that_user_logged_in_sucessfully_in_application() {
        System.out.println("verify that user has been logged in successfully");
    }


}
