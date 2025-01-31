package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestSuits {

    WebDriver driver;

    @Test
    public void loginPage()
    {


    }

    @Test
    public  void test2(){
        System.out.println("I am in test2 block");
    }
    public  void test3(){
        System.out.println("I am in test3 block");
    }
    @Test(groups = {"chrome","Sanity"})
    public  void testCase4(){
        System.out.println("I am in test Case4 block");
    }


    @BeforeClass
    public void TestBeforeClass(){
        System.out.println("This is before class");
    }

    @BeforeMethod
    public void BeforeMethod(){
         driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod

    public void AfterMethod(){
        driver.quit();
        System.out.println("It will execute after ever method");
    }

}
