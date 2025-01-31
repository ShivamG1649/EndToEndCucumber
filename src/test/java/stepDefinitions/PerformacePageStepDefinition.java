package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.AdminPage;
import pageObjects.HomePage;
import pageObjects.PageObjectManager;
import pageObjects.PerformancePage;
import utils.TestContext;

public class PerformacePageStepDefinition {
    TestContext testContext;
    HomePage hp;
    PerformancePage pp;
    PageObjectManager pageObjectManager;
    public PerformacePageStepDefinition(TestContext testContext)
    {
        this.testContext=testContext;
    }
    @Given("Click on performance link on left panel")
    public void clickOnPerformanceLink() throws InterruptedException {
        hp=  testContext.pageObjectManager.getHomePage();
        hp.clickOnPerformanceLink();
    }

    @When("Verify that Search button on the page")
    public void VerifySearchButton() {
        pp=  testContext.pageObjectManager.getPerformancePagePage();
        Boolean status=pp.verifySearchButtonOnPageIsEnabled();
        Assert.assertTrue(status);

    }



}
