package SeleniumBasics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotDemo {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        //TakesScreenshot screenshot = ((TakesScreenshot) driver).getScreenshotAs()


        // Take screenshot

        // Webdriver driver = new WebDriver()  // Upcasting

        //



      File screenShoot=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      File destination = new File("Screenshot2323.png");
      FileUtils.copyFile(screenShoot,destination);
      // Save the screenShot at a location in system

//        try {
//            FileUtils.copyFile(screenShoot, new File("ScreenShot1234.jpg"));
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

        Thread.sleep(5000);

        driver.quit();
    }
}
