package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bson.io.BsonOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.HomePage;
import pageObjects.LandingPage;

import java.io.IOException;
import java.time.Duration;

public class loginDemoStepDefinition {


     WebDriver driver;
     LandingPage lp;
     HomePage hp;
    @Given("I open application url")
    public void i_open_application_url() {

         driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         System.out.println("opening application URL");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

    }
    @When("I  user enters valid username")
    public void i_user_enters_valid_username() {
        lp=new LandingPage(driver);
        lp.enterUserName("Admin");
    }
    @When("I user enters valid password")
    public void i_user_enters_valid_password() {
        lp.enterPassword("admin123");
    }

    @When("I user enters inValid password")
    public void i_user_enters_Invalid_password() {
        lp.clickOnLogInBtn();
    }
    @When("I  user click on login button")
    public void i_user_click_on_login_button() {
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
    @Then("I verify that user logged in successfully in application")
    public void i_verify_that_user_logged_in_sucessfully_in_application() {

        // Verify that user has been logged in successfully
        System.out.println("verify that user has been logged in successfully");
          hp=new HomePage(driver);
      boolean status =  hp.isUserImageDisplayed();
        Assert.assertTrue(status);
//        Assert.assertFalse(status);
    }

    @When("verify the error message on the login page")
    public void verifyTheErrorMessageOnLoginPage() {
        boolean status =driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();
        Assert.assertTrue(status);
    }


    // Hooks , Before / After / BeforeClass / After class


    @After
    public void tearDown() throws IOException {
        System.out.println("This will execute after every test cases");
        driver.quit();
    }

    @BeforeAll
   public static void before_or_after_all(){
        System.out.println(" It will execute before feature file only one time");
    }


}
