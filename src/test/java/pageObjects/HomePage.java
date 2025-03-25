package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    By performancePageLink =By.xpath("//span[normalize-space()='Performance']");
    By orangeHRMImage=By.xpath("//img[@class='oxd-userdropdown-img']");

    public HomePage(WebDriver driver)
    {
        this.driver =driver;
    }

    // Actions methods

    public void clickOnPerformanceLink(){
       driver.findElement(performancePageLink).click();
    }

    public boolean isUserImageDisplayed(){
        boolean status =   driver.findElement(orangeHRMImage).isDisplayed();
       return status;
    }

}
