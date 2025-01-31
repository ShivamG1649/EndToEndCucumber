package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SecondTestSuit {
    WebDriver driver;
   @Test
    public void TC01_S2()
   {
       driver = new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       System.out.println("In Test case1 of S2");
   }

    @Test()
    public void TC02_S2()
    {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("In Test case1 of S2");
        System.out.println("In Test case2 of S2");
    }

    @AfterMethod()
    public void timeout() throws InterruptedException {
       Thread.sleep(5000);
    }



}
