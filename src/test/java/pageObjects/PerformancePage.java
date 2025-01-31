package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformancePage
{
    public WebDriver driver;

    // Locators
    By searchButton =By.xpath("//button[@type='submit']");

    public PerformancePage(WebDriver driver)
    {
        this.driver =driver;
    }

    //Action method  , verification ( isEnabled )

    public boolean verifySearchButtonOnPageIsEnabled(){
       return  driver.findElement(searchButton).isEnabled();
    }






}
