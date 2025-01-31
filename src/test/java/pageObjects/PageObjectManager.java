package pageObjects;
// This class is responsible to crete all objects , and also known as object factory
// so this approach is well known as factory design pattern

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public LandingPage landingPage;
    public AdminPage adminPage;
    public HomePage homePage;
//    int a =10;
    public PerformancePage performancePage;
    public DashBoardPage dashBoardPage;
    public LeavePage leavePage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage getLandingPage(){
        landingPage=new LandingPage(driver);
        return landingPage;
    }

    public AdminPage getAdminPage()
    {
        adminPage  = new AdminPage(driver);
        return adminPage ;
    }
    public PerformancePage getPerformancePagePage()
    {
        performancePage  = new PerformancePage(driver);
        return performancePage ;
    }

    public DashBoardPage getDashBoardPage(){
        return dashBoardPage = new DashBoardPage(driver);
    }

    public LeavePage getLeavePage(){
        return leavePage = new LeavePage(driver);
    }

    public HomePage getHomePage(){
        return homePage = new HomePage(driver);
    }
}
