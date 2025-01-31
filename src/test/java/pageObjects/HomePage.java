package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    By performancePageLink =By.xpath("//span[normalize-space()='Performance']");

    public HomePage(WebDriver driver)
    {
        this.driver =driver;
    }

    // Actions methods

    public void clickOnPerformanceLink(){
       driver.findElement(performancePageLink).click();
    }

}
