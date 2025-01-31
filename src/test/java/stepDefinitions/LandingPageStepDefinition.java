package stepDefinitions;

import utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.DashBoardPage;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;

import java.time.Duration;

public class LandingPageStepDefinition {
    TestContext testContext;
    LandingPage lp;
    DashBoardPage dp;
    PageObjectManager pageObjectManager;
    public LandingPageStepDefinition(TestContext testContext){
        this.testContext=testContext;
    }
    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() throws InterruptedException {

    }
    @When("enter valid userName {string}")
    public void enter_valid_user_name(String uName) {
      //  this.lp = new LandingPage(testContext.driver);
      //  pageObjectManager=new PageObjectManager(testContext.driver);
      //  this.lp=pageObjectManager.getLandingPage();
        this.lp=testContext.pageObjectManager.getLandingPage();
        lp.enterUserName(uName);
    }
    @When("enter valid password {string}")
    public void enter_valid_password(String password) {
        lp.enterPassword(password);
    }
    @When("Click on signIn button")
    public void click_on_sign_in_button() {
        lp.clickOnLogInBtn();
    }
    @Then("verify that user is at home page")
    public void verify_that_user_is_at_home_page() {
      // verification code for the user to be in home page
//        dp=new DashBoardPage(testContext.driver);
        this.dp=testContext.pageObjectManager.getDashBoardPage();
        boolean HRMLogoStatus=dp.verifyHRLLogo();
        Assert.assertFalse(HRMLogoStatus);
//        testContext.driver.quit();
    }
    @Then("verify the title of login page should contain {string}")
    public void verify_the_title_of_login_page_should_contain(String string)
    {
       boolean status = testContext.driver.getTitle().contains(string);
        Assert.assertTrue(status);
        testContext.driver.quit();
    }

    @Then("User verify that login text is displayed on the landing page")
    public void verifyLoginPageText()
    {
        // to verify the text login with expected text

        // Expected / Actual

        // Expected = Actual -> Pass

        // Assertion is required

        this.lp=testContext.pageObjectManager.getLandingPage();

        String ExpectedText="Login";

        String ActualText= lp.getLoginText();

        Assert.assertEquals(ActualText,ExpectedText);

    }




}
